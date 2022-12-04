package com.zookeeper;

public class ZookeeperTest {
    public static void main(String[] args) {
        Gorilla rilla1 = new Gorilla();
        rilla1.throwSomething().throwSomething().throwSomething().eatBananas().eatBananas().climb().displayEnergy();
        Bat bat1 = new Bat();
        bat1.attackTown().attackTown().attackTown().eatHuman().eatHuman().fly().displayEnergy();
    }
}