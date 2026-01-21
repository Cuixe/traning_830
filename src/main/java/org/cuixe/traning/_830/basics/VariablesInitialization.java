package org.cuixe.traning._830.basics;

public class VariablesInitialization {

    static int y = 10;
    static int x;
    static int z = y + x;

    int a = 3;
    int b;
    int c = a + b;


    public static void main(String[] args) {
        int x; // Now x is initialized
        int y;
        if(args.length>0) {
            x = 5;
        } else {
            x = 15;
        }
        System.out.println(x);
        System.out.println(z);
        System.out.println(new VariablesInitialization().c);
        //System.out.println(y); // This will cause a compilation error
    }
}
