package org.cuixe.traning._830.basics;

public class StringBasics {

    public static void main(String[] args) {
        //creation();
        //charAt();
        substring();
        indexOf();
    }

    public static void length() {
        System.out.println("animal".length()); //6
    }

    public static void charAt() {
        System.out.println("animal".charAt(0)); //a
        System.out.println("animal".charAt(5)); //l
        System.out.println("animal".charAt(6)); //Exception
    }

    public static void substring() {
        System.out.println("animal".substring(3)); //mal
        System.out.println("animal".substring(5)); //l
        System.out.println("animal".substring(2, 4)); //im
    }

    public static void indexOf() {
        System.out.println("animal".indexOf('a')); //0
        System.out.println("animal".indexOf("al")); //4
        System.out.println("animal".indexOf('a', 4)); //4
        System.out.println("animal".indexOf("al", 5)); //-1
        System.out.println("animal".indexOf('a',2,4)); //-1
    }

    public static void creation() {
        String name1 = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = """
                Fluffy""";

        System.out.println("Name1: " + name1.hashCode());
        System.out.println("Name2: " + name2.hashCode());
        System.out.println("Name3: " + name3.hashCode());
    }

    public static void concatenating() {
        System.out.println(1 + 2);        // 3
        System.out.println("a" + "b");    // ab
        System.out.println("a" + "b" + 3);// ab3
        System.out.println(1 + 3 + "b");  // 4b
        System.out.println("a" + 3 + 2);  // a32
        System.out.println("c" + null);   // cnull
    }

    public static void search() {
        "abc".startsWith("ab");  //true
        "abc".startsWith("A");   //false

        "abc".startsWith("b",1);  //true
        "abc".startsWith("b", 2); //false

        "abc".endsWith("c");  //true
        "abc".endsWith("a");  //false

        "abc".contains("a");  //true
        "abc".contains("B");  //false
    }

    public static void equals() {
        var x = "abc";
        var y = "abc";
        System.out.println(x == y);
    }

}
