package org.cuixe.traning._830.basics;

public class TextBlock {

    static String text = """
    This is a text block
        can be used in different ways
    """;

    //static String failedText = """This will not compile""";

    static String thisWorks = """
      this is just
      another text block""";

    public static void main(String... args) {

        assert text.equals("This is a text block\n    can be used in different ways\n");
        System.out.println(text);
        System.out.println(thisWorks);
    }
}
