package extra.task2;

import java.util.Arrays;
import java.util.List;

public class Converter {

    private static final List<Integer> arabic = Arrays.asList(1, 5, 10, 50, 100, 500, 1000);
    private static final List<String> roman = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    static public String convertToRome(int number) {
        StringBuilder result = new StringBuilder();

        int times;
        for (int i = arabic.size() - 1; i >= 0; i--) {
            times = number / arabic.get(i);
            number -= times * arabic.get(i);
            if (times > 0) {
                result.append(roman.get(i).repeat(times));
            }

            int step = i % 2 == 0 ? 2 : 1;
            if (i - step >= 0 && number / (arabic.get(i) - arabic.get(i - step)) == 1) {
                result.append(roman.get(i - step).concat(roman.get(i)));
                number -= arabic.get(i) - arabic.get(i - step);
            }
        }

        return result.toString();
    }
}
