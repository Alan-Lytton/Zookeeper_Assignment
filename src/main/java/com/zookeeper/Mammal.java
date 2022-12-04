package com.zookeeper;

public class Mammal {
    protected int energyLevel = 100;

    /**
     * Shows mammals current energy level out of 100
     * @return The mammals current energy levels
     */
    public int displayEnergy(){
        System.out.printf("The current energy is %s/100\n", this.energyLevel);
        return  this.energyLevel;
    }

    /**
     * Setter to change the default values of energy levels.
     * @param amount the value to change the new default to.
     * @return the new default for this specific object
     */
    public int changeEnergyLevel(int amount){
        this.energyLevel = amount;
        return this.energyLevel;
    }
}
