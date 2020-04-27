package Graphs.TravellingSalesman;

import java.util.ArrayList;
import java.util.List;

public class Repository
{
    //contains list of cities
    private static List<City>  cityList=new ArrayList<>();

    public static void addCity(City city){
        cityList.add(city);
    }
    public static City getCity(int index){
       return cityList.get(index);
    }
    public static int getnumberofCities(){
        return cityList.size();
    }
}
