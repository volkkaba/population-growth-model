package org.example.populationgrowthmodel;

public class Population {
    String name;
    int initialPopulationSize;
    int currentPopulationSize;
    double growthRate;
    double time;
    double birthRate;
    double deathRate;

    Population(String name, int initialPopulationSize, double growthRate, double birthRate,
               double deathRate){
        this.name = name;
        this.initialPopulationSize = initialPopulationSize;
        this.growthRate = growthRate;
        this.birthRate = birthRate;
        this.deathRate = deathRate;


    }



}
