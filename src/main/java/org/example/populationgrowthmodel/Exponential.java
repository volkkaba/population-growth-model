package org.example.populationgrowthmodel;

public class Exponential extends Population {
    Exponential(String name, int initialPopulationSize, int currentPopulationSize,
                double growthRate, double time, double birthRate, double deathRate){
        super(name, initialPopulationSize, currentPopulationSize, growthRate, time, birthRate, deathRate);
    }
    }
