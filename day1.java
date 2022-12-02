import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CalendarioDeAdviento1 {
    public int getTheElfWithMoreCalories(String input) {
        List<String> caloriesPerElf = Arrays.asList(input.split("\n\n"));
        List<Integer> totalCaloriesPerElf = caloriesPerElf.stream()
                .map(elfCalories -> Arrays.stream(elfCalories.split("\n"))
                        .mapToInt(Integer::parseInt).sum())
                .collect(Collectors.toList());
        return Collections.max(totalCaloriesPerElf);
    }

    public int getTopThreeCalories(String input) {
        List<String> caloriesPerElf = Arrays.asList(input.split("\n\n"));
        List<Integer> totalCaloriesPerElf = caloriesPerElf.stream()
                .map(elfCalories -> Arrays.stream(elfCalories.split("\n"))
                        .mapToInt(Integer::parseInt).sum())
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return totalCaloriesPerElf.get(0) + totalCaloriesPerElf.get(1) + totalCaloriesPerElf.get(2);
    }
}
