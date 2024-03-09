package org.example.populationgrowthmodel;

public class Population {
    String name;
    int initialPopulationSize;
    int currentPopulationSize;
    double growthRate;
    double time;
    double birthRate;
    double deathRate;

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
    public void setTime(double time){
        this.time = time;
    }
    public void setBirthRate(double birthRate){
        this.birthRate = birthRate;
    }
    public void setDeathRate(double deathRate){
        this.deathRate = deathRate; deathRate = deathRate;
    }

    public static void main(String[] args){
        System.out.println("Hello");

        System.out.println("HELLO2");
        System.out.println("hello");
    }


}