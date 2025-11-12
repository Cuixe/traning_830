package org.cuixe.traning._830.basics;

import org.cuixe.traning._830.basics.farm.Cow;

public class DestroyingObjects {

    public static void main(String... args) {

        Cow cow1, cow2;
        cow1 = new Cow("Pancha",10);
        cow2 = new Cow("Lola",5);

        cow1 = cow2;

        Cow cow3 = cow1;

        cow1 = null;

        System.gc();

    }

}
