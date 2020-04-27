package Graphs.TravellingSalesman;

import java.util.List;

public class SimulatedAnnealing
{
    private SingleTour best;
    public void Simulation()
    {
        double temperature = 10000;
        double coolingRate = 0.003;

        SingleTour currentSolution = new SingleTour();
        currentSolution.generateIndividual();

        System.out.println("Initial solution distance: " + currentSolution.getDistance());

        best = new SingleTour(currentSolution.getTour());

        while (temperature > 1) {

            SingleTour newSolution = new SingleTour(currentSolution.getTour());

            int randGeneratedIndex1 = (int) (newSolution.tourSize() * Math.random());
            City city1 = newSolution.getCity(randGeneratedIndex1);

            int randGeneratedIndex2 = (int) (newSolution.tourSize()* Math.random());
            City city2 = newSolution.getCity(randGeneratedIndex2);

            newSolution.setCity(randGeneratedIndex2, city1);
            newSolution.setCity(randGeneratedIndex1, city2);

            double currentEnergy = currentSolution.getDistance();
            double neighbourEnergy = newSolution.getDistance();

            if (AcceptanceProbability(currentEnergy, neighbourEnergy, temperature) > Math.random()) {
                currentSolution = new SingleTour(newSolution.getTour());
            }

            if (currentSolution.getDistance() < best.getDistance()) {
                best = new SingleTour(currentSolution.getTour());
            }

            temperature *= 1 - coolingRate;
        }
    }
    public SingleTour getBest(){
        return best;
    }

    private double AcceptanceProbability(double newEnergy, double currentEnergy, double temperature)
    {
        return newEnergy<currentEnergy?1:Math.exp((newEnergy-currentEnergy)/temperature);
    }
}
