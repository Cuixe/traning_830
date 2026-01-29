package cap4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraysTest {

    @Test
    void using() {
        String[] animals = {"mono", "burro", "perro"};
        assertEquals(3, animals.length);
        assertTrue(animals[0] == "mono");
    }

    @Test
    void sorting() {
        String[] numbers = {"1", "9", "100"};
        Arrays.sort(numbers);
        assertEquals("1", numbers[0]);
        assertEquals("100", numbers[1]);
        assertEquals("9", numbers[2]);
    }

}
