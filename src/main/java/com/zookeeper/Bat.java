package com.zookeeper;

public class Bat extends Mammal {

    public Bat(){
        this.changeEnergyLevel(300);

    }

    /**
     * Displays the current bat's energy level out of 300
     * @return the current energy level for the bat.
     */
    @Override
    public int displayEnergy() {
        System.out.printf("The current energy is %s/300\n", this.energyLevel);
        return  this.energyLevel;
    }

    /**
     * Method to cause the bat to fly at the cost of 50 energy
     * @return the current active bat.
     */
    public Bat fly(){
        System.out.println("The bat shoots into the sky");
        this.energyLevel -= 50;
        return this;
    }

    /**
     * Method for the bat to consume humans and restore its energy by 25 points
     * @return the current active bat.
     */
    public Bat eatHuman(){
        System.out.println("The bat picks up a human and consumes them in one bite.");
        this.energyLevel += 25;
        return this;
    }

    /**
     * Method for the bat to attack a nearby town at the cost of 100 energy
     * @return the current active bat.
     */
    public Bat attackTown(){
        System.out.println("The bat begins smashing and burning buildings in a nearby town.");
        this.energyLevel -= 100;
        return this;
    }
}
