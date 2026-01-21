package org.cuixe.traning._830.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecisionMaking {

    public static void main(String[] args) {

        whileLoop();
        doWhileLoop();

        System.out.println(switchExpression( "Pedro"));
        System.out.println(switchExpression( "Jane"));
        System.out.println(switchExpression( "Other"));

        switchExpression(-1);
        switchExpression(1);
        flow();
    }

    private static void ifElse(int type, int age) {
        if(type < 0) {
            System.out.println("Less than zero");
        } else if(type == 0) {
            System.out.println("Equals zero");
        }
        else {
            System.out.println("Greater than zero");
        }
    }


    private static void patternVariable(Number number) {
        if(number instanceof Integer i) {
            System.out.printf(i + "is an integer");
        } else if (number instanceof Double d && d < 10) {
            System.out.printf(d + "is a double");
        }
    }

    private void switchCase(int option) {
        switch(option) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 3:
                throw new IllegalArgumentException("Invalid option");
            case 2:
                System.out.println("Option 2 selected");
            default:
                System.out.println("No option selected");
        }
    }

    private static int switchExpression(String fishName) {
         return switch(fishName) {
            case "clownfish" -> 1;
            case null -> 2;
            default -> 3;
        };
    }

    private static String ternaryOperator(int option) {
        /*return switch (option) {
            case 1 -> "Option 1";
            case 2 -> "Option 2";
        };*/
        return option == 1 ? "Option 1" : "Option 2";
    }

    private static void switchExpression(Number option) {
        String message = switch (option) {
            case Integer f when f > 0 -> "Positive integer: " + f;
            case Integer i -> "Negative Integer: " + i;
            case Double d -> "Double: " + d;
            default -> "Unknown";
        };
        System.out.println(message);
    }

    private static void nestedIfElse(int fish, int size) {
        var name = switch (fish) {
            case 1 -> "Salmon";
            case 2 -> {
                yield "Tuna";
            }
            case 3 -> {
                if (size == 3) {
                    yield "Lobster";
                }
                yield "Shrimp";
            }
            case 4 -> throw new IllegalArgumentException("Invalid fish");
            default -> "Unknown fish";
        };
    }

    private static void forLoop() {
        for(int i=0, j=0, k=0; i<10;i++) {
            if (i%2 == 0) {
                j++;
            }
            for(;k<10;k++) {
                System.out.println("K:" + k);
            }
            System.out.println("Values:" + i + ", " + j + ", " + k);
        }
    }

    private static void whileLoop() {
        int total = 10;
        int rounds = 0;
        while(rounds < total) {
            System.out.println("this is the round: " + (rounds++));
        }
        System.out.println("Finished");
    }

    private static void doWhileLoop() {
        int total = 10;
        int rounds = 0;
        do {
            System.out.println("this is the round: " + (rounds++));
        } while(rounds < total);
        System.out.println("Finished");
    }

    private static void foreach() {
        List<String> list = Arrays.asList("a", "b", "c");
        for(String s : list) {
            System.out.println(s);
        }
    }

    private static void flow() {

        FIRST_LOOP:for(int i=0; i<=10; i++) {
            SECOND_LOOP:for(int j=0; j<10; j++) {
                if(j % 3 > 0) {
                    System.out.println("continue");
                    continue SECOND_LOOP;
                }
                else if (i%2 > 0) {
                    System.out.println("break");
                    break FIRST_LOOP;
                }
            }

        }
    }
}
