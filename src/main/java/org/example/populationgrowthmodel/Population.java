package org.example.populationgrowthmodel;

public class Population {
    String name;
    int initialPopulationSize;
    int currentPopulationSize;
    double growthRate;
    double time;
    double birthRate;
    double deathRate;

    Population(String name, int initialPopulationSize, int currentPopulationSize,
               double growthRate, double time, double birthRate, double deathRate){
        this.name = name;
        this.initialPopulationSize = initialPopulationSize;
        this.currentPopulationSize = currentPopulationSize;
        this.growthRate = growthRate;
        this.time = time;
        this.birthRate = birthRate;
        this.deathRate = deathRate;


    }



}
