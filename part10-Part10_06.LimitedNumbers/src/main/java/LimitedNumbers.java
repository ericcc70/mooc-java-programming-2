
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> hello = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input<0){
                break;
            }
            hello.add(input);
            
        }
        hello.stream().filter(i->i<6).forEach(i->System.out.println(i));
    }
}
