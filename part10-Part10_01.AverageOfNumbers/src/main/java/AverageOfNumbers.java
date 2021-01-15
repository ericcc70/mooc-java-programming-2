
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> hello = new ArrayList<>();
        // Write your program here
        while (true) {
            String answer = scanner.next();
            if (answer.equals("end")) {
                break;
            }
            hello.add(answer);
        }
        double average = hello.stream().mapToInt(s->Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers:"+average);
    }
}
