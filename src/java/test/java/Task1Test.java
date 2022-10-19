import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    Task1 task1 = new Task1();


    @Test
    public void minimumValue() {
        assertEquals(-2, task1.minVal(new int[] {6, 9, 15, -2, 92, 11}));
        assertEquals(-6, task1.minVal(new int[] {-6, 9, 15, -2, 92, 11}));
    }

    @Test
    public void maxValue() {
        assertEquals(92, task1.maxVal(new int[] {6, 9, 15, -2, 92, 11}));
    }

    @Test
    public void numberOfElements() {
        assertEquals(6, task1.numberOfElements(new int[] {6, 9, 15, -2, 92, 11}));
    }

    @Test
    public void averageValue() {
        assertEquals(21, task1.averageValue(new int[] {6, 9, 15, -2, 92, 11}));
    }


}
