package others;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrdinalConverterTest {
    private OrdinalConverter ordinalConverter = null;

    @Test
    public void numberToOrdinal() {
        ordinalConverter = new OrdinalConverter();
        assertEquals("1st", ordinalConverter.numberToOrdinal(1));
        assertEquals("2nd", ordinalConverter.numberToOrdinal(2));
        assertEquals("3rd", ordinalConverter.numberToOrdinal(3));
        assertEquals("4th", ordinalConverter.numberToOrdinal(4));
        assertEquals("10th", ordinalConverter.numberToOrdinal(10));
    }
}