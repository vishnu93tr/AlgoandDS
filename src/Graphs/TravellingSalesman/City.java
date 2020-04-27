package Graphs.TravellingSalesman;

public class City
{
    private int x;
    private int y;

    public City()
    {
        //constructor must have capability to have a random value of x and y
        this.x= (int) (Math.random()*100);
        this.y=(int)(Math.random()*100);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //method to calculate distance from one city to another
    public double distanceTo(City city)
    {
        double xdistance=getX()-city.getX();
        double ydistance=getY()-city.getY();

        return Math.sqrt(Math.pow(xdistance,2)+Math.pow(ydistance,2));
    }
}
