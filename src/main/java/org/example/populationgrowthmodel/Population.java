package org.example.populationgrowthmodel;

public class Population {
    private String name;
    private int initialPopulationSize;
    private int currentPopulationSize;
    private double growthRate;
    private double time;
    private double birthRate;
    private double deathRate;

    public Population(String name, int initialPopulationSize, int currentPopulationSize,
               double growthRate, double time, double birthRate, double deathRate){
        this.name = name;
        this.initialPopulationSize = initialPopulationSize;
        this.currentPopulationSize = currentPopulationSize;
        this.growthRate = growthRate;
        this.time = time;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setInitialPopulationSize(int initialPopulationSize){
        this.initialPopulationSize = initialPopulationSize;
    }
    public void setGrowthRate(int growthRate){
        this.growthRate = growthRate;
    }



}
