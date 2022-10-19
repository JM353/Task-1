import java.util.Arrays;
import java.util.List;

public class Task1 {


    public int minVal(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

    public int maxVal(int[] ints) {
        int max = ints[1];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }

    public int numberOfElements(int[] ints) {
        return ints.length;
    }
}
