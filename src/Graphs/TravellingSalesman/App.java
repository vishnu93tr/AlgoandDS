package Graphs.TravellingSalesman;

public class App
{
    public static void main(String[] args)
    {

        for(int i=0;i<100;i++)
        {
            City city=new City();
            Repository.addCity(city);
        }
        SimulatedAnnealing simulatedAnnealing=new SimulatedAnnealing();
        simulatedAnnealing.Simulation();
        System.out.println(simulatedAnnealing.getBest().getDistance());
    }
}
