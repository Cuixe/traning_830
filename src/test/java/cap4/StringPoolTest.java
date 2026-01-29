package cap4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringPoolTest {

    @Test
    public void equals() {
        var s1 = "hello world";
        var s2 = "hello world".trim();
        Assertions.assertTrue(s1 == s2);
    }

    @Test
    public void trim() {
        var s1 = "hello world";
        var s2 = "hello world".replaceAll(" ", "");
        Assertions.assertFalse(s1 == s2);
    }

    @Test
    public void concat() {
        var s1 = "hello world";
        var s2 = "hello ";
        var concat = s2 + " world";
        Assertions.assertFalse(s1 == concat);
    }

    @Test
    public void newString() {
        var s1 = "hello world";
        var s2 = new String("hello ");
        Assertions.assertFalse(s1 == s2);
    }

    @Test
    public void intern() {
        var s1 = "hello world";
        var s2 = new String("hello ").intern();
        Assertions.assertFalse(s1 == s2);
    }

    @Test
    public void varios() {
        var one="rat" + "1";
        var two = "r" + "a" + "t" + "1";
        var three= "r" +"a" + "t" + new String("1");

        Assertions.assertTrue(one == two);
        Assertions.assertTrue(one == two.intern());
        Assertions.assertFalse(one == three);
        Assertions.assertTrue(one == two.intern());
    }


}
