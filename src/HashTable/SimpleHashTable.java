package HashTable;

public class SimpleHashTable
{
    private StoredEmployee[] hashtable;

    public SimpleHashTable()
    {
        hashtable=new StoredEmployee[10];
    }
    public int hash(String string){
        return string.length()%hashtable.length;
    }
    public void put(String key,Employee employee)
    {
        int hashkey=hash(key);
        if(Occupied(hashkey)){
            //do linear probing here
            //get the stop index to stop when to look furthur
            int stopIndex=hashkey;
            if(hashkey==hashtable.length-1){
                hashkey=0;
            }
            else{
                hashkey++;
            }
            while(Occupied(hashkey) && hashkey!=stopIndex)
            {
                hashkey=(hashkey+1)%hashtable.length;
            }
        }

        if(Occupied(hashkey))
        {
            System.out.println("oops we have a value at that hashed key"+hashkey);
        }
        else{
            hashtable[hashkey]=new StoredEmployee(key,employee);
        }
    }
    public Employee get(String key)
    {
        int hashKey=FindKey(key);
        if(hashKey==-1){
            return null;
        }
        else {
            return hashtable[hashKey].employee;
        }
    }
    public int FindKey(String key)
    {
        //Find key without linear probing
        int hashKey=hash(key);
        if(hashtable[hashKey]!=null &&  hashtable[hashKey].key.equals(key)){
            return hashKey;
        }
        //Find key with linear probing
        int stopIndex=hashKey;
        //wrap stopindex to front of hashtable if suitable place not found or increment hashkey
        if(hashKey==hashtable.length-1){
            hashKey=0;
        }
        else{
            hashKey++;
        }
        while(hashtable[hashKey]!=null && hashKey!=stopIndex && !hashtable[hashKey].key.equals(key))
        {
            hashKey=(hashKey+1)%hashtable.length;
        }

        if(hashtable[hashKey]!=null && hashtable[hashKey].key.equals(key))
        {
            return hashKey;
        }
        else{
            return -1;
        }
    }
    public Employee remove(String key)
    {
        int hashedKey=FindKey(key);
        if(hashedKey==-1){
            return null;
        }
        Employee employee=hashtable[hashedKey].employee;
        hashtable[hashedKey]=null;
        StoredEmployee[] oldHashTable=hashtable;
        hashtable=new StoredEmployee[oldHashTable.length];
        for(int i=0;i<oldHashTable.length;i++){
            if(oldHashTable[i]!=null)
            {
                put(oldHashTable[i].key,oldHashTable[i].employee);
            }
        }
        return employee;
    }

    public void print(){
        for(StoredEmployee employee:hashtable)
            if(employee==null){
                System.out.println("empty");
            }
        else {
                System.out.println(employee.employee);
            }
    }
    public boolean Occupied(int index)
    {
        return hashtable[index]!=null;
    }
}
