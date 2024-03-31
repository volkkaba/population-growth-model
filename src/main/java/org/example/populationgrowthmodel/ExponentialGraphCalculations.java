package org.example.populationgrowthmodel;

public class ExponentialGraphCalculations {
    private double initialPopulationSize;
    private double birthRate;
    private double deathRate;
    private double growthRate;

    ExponentialGraphCalculations(double initialPopulationSize, double birthRate, double deathRate){
        this.initialPopulationSize = initialPopulationSize;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
    }
    ExponentialGraphCalculations(){}

    public double getGrowthRate(double initialPopulationSize, double birthRate, double deathRate){
        growthRate = (birthRate - deathRate) / initialPopulationSize;
        return  growthRate;
    }


}
