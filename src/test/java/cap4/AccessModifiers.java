package cap4;

import org.junit.jupiter.api.Test;
import utils.Box;
import utils.Saver;

public class AccessModifiers {

    @Test
    void access() {
        Box box = new Box();

        Saver saver = new Saver();
        saver.putElement("element");
        saver.removeElement();
        saver.isEmpty();
    }
}
