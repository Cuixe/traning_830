package org.cuixe.traning._830.basics.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final String farmName;
    private final List<Cow> cows = new ArrayList<>();

    {
        System.out.println("Initializing Instance Block");
    }

    public Farm(String farmName) {
        this.farmName = farmName;
        System.out.println("Initializing a Farm Instance");
        this.cows.add(new Cow("chana", 8));
        this.cows.add(new Cow("juana", 12));
        this.cows.add(new Cow("carmela", 20));
    }

    public void printNumberOfCows() {
        System.out.println(cows.size());
    }

    public String getFarmName() {
        return farmName;
    }

    public static void main(String... args) {
        System.out.println("Starting Farm");
        Farm farm = new Farm("Rancho prieto");
        System.out.println(farm.getFarmName());

        Farm farm2 = new Farm("Rancho arroyo");
        System.out.println(farm2.getFarmName());

    }
}
