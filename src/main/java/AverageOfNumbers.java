
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        double average = inputs.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
