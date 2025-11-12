package org.cuixe.traning._830.basics;

import org.cuixe.traning._830.basics.farm.Cow;
import org.cuixe.traning._830.basics.farm.Farm;

public class Var {

    public static void main(String[] args) {

        var cow1 = new Cow("Berta",10);
        System.out.println("Cow name: " + cow1.getName() + ", age: " + cow1.getAge());
        var farm = getFarm();
        System.out.println("Farm name: " + farm.getFarmName());
        var number = 5;
        int a  = number;
        cow1 = new Cow("Pancha",10);

        number = "Not number";                                                                     // This line will not compile because 'var' is statically typed
        var age = 25, height = 175;                                                                  // This line will not compile because 'var' cannot be used for multiple variables in a single declaration
        var cow2;                                                                                    // This line will not compile because the type cannot be inferred without an initializer
        var cow3 = null;                                                                                // This line will not compile because the type cannot be inferred from a null initializer

    }

    public static addition(var a, var b) {                                               // This line will not compile because 'var' cannot be used in method parameters
        return a + b;
    }

    public static Farm getFarm() {
        return new Farm("Old MacDonald's Farm");
    }

}
