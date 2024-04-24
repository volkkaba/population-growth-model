package org.example.populationgrowthmodel;

public class ExponentialGraphCalculations {
    private double initialPopulationSize;
    private double birthRate;
    private double deathRate;
    private double growthRate;
    private double carryingCapacity;

    ExponentialGraphCalculations(double initialPopulationSize, double birthRate, double deathRate, double carryingCapacity){
        this.initialPopulationSize = initialPopulationSize;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
        this.carryingCapacity = carryingCapacity;
    }
    ExponentialGraphCalculations(){}

    public double getGrowthRate(double initialPopulationSize, double birthRate, double deathRate){
        this.growthRate = (birthRate - deathRate) / initialPopulationSize;
        return  growthRate;
    }

    // Getter methods
    public double getInitialPopulationSize() {
        return initialPopulationSize;
    }

    public double getBirthRate() {
        return birthRate;
    }

    public double getDeathRate() {
        return deathRate;
    }

    public double getGrowthRate() { // Getter for calculated growthRate
        return growthRate;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

}
