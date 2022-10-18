import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    Task1 task1 = new Task1();


    @Test
    public void minimumValue() {
        assertEquals(-2, task1.sorting(new int[] {6, 9, 15, -2, 92, 11}));
    }
}
