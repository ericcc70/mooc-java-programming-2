
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> hello = new ArrayList<>();
        // Write your program here
        while (true) {
            String answer = scanner.next();
            if (answer.equals("end")) {
                break;
            }
            hello.add(answer);
        }
        String what = scanner.next();
        if(what.equals("p")){
            double average = hello.stream().mapToInt(s->Integer.valueOf(s)).filter(number->number>0).average().getAsDouble();
            System.out.println("Average of the positive numbers: "+average);
        } else{
        
        double average = hello.stream().mapToInt(s->Integer.valueOf(s)).filter(number->number<0).average().getAsDouble();
        System.out.println("Average of the negative numbers: "+average);
        }
    }
}
