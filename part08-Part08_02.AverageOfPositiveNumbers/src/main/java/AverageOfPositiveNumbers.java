
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hello = Integer.valueOf(scanner.next());
        int counter = 0;
        double sum = 0;
             
        while(hello!=0){
            if(hello>0){
                sum+=hello;
                counter+=1;
            }
            hello = Integer.valueOf(scanner.next());
        }
        if(sum!=0){
            System.out.println(""+sum/counter);
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
