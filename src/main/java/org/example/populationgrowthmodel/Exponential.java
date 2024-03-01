package org.example.populationgrowthmodel;

public class Exponential extends Population {
    Exponential(String name, int initialPopulationSize, int currentPopulationSize,
                double growthRate, double time, double birthRate, double deathRate){
        super(name, initialPopulationSize, currentPopulationSize, growthRate, time, birthRate, deathRate);
    }
    /*
    Double end is just a filler to avoid error on the return, actual code meant to be entered
     */
    public double ComputeExponentialGrowth(){
        double end = 1;
        return end;
    }
    public double ComputeExponentialSize(){
        double end = 1;
        return end;
    }
    public double ComputeExponentialGrowthRate(){
        double end = 1;
        return end;
    }
    public void GenerateExponentialPath(){

    }


}
