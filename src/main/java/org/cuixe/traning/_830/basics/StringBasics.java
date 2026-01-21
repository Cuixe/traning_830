package org.cuixe.traning._830.basics;

public class StringBasics {

    public static void main(String[] args) {
        creation();
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

}
