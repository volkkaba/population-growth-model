package org.example.populationgrowthmodel;

public class Logistical extends Population {
    Logistical(String name, int initialPopulationSize, int currentPopulationSize,
               double growthRate, double time, double birthRate, double deathRate){
        super(name, initialPopulationSize, currentPopulationSize, growthRate, time, birthRate, deathRate);
    }
    /*
    Double end is just a filler to avoid error on the return, actual code meant to be entered
     */
    public double ComputeLogisticalGrowth(){
        double end = 1;
        return end;
    }
    public double ComputeLogisticalSize(){
        double end = 1;
        return end;
    }
    public double ComputeDiscreteLogisticalSize(){
        double end = 1;
        return end;
    }
    public double ComputeLogisticalGrowthRate(){
        double end = 1;
        return end;
    }
    public void GenerateLogisticalPath(){

    }


}
