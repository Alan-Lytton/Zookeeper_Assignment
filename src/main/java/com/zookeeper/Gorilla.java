package com.zookeeper;

public class Gorilla extends Mammal {
    /**
     * Method to throw something at the people watching at the cost of 5 energy.
     * @return the active gorilla.
     */
    public Gorilla throwSomething(){
        System.out.println("The Gorilla throws something at the people.");
        this.energyLevel -= 5;
        return this;
    }

    /**
     * Method to eat a banana and recoup 10 energy
     * @return the active gorilla
     */
    public Gorilla eatBananas(){
        System.out.println("The gorilla happily scarfs down a banana.");
        this.energyLevel += 10;
        return this;
    }

    /**
     * Method for the gorilla to climb into the trees at the cost of 10 energy
     * @return the active gorilla
     */
    public Gorilla climb(){
        System.out.println("The gorilla climbs into the trees.");
        this.energyLevel -= 10;
        return this;
    }
}
