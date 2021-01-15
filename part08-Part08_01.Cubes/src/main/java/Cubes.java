
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hello = scanner.next();
        while(!hello.equals("end")){
            System.out.println(""+Integer.valueOf(hello)*Integer.valueOf(hello)*Integer.valueOf(hello));
            hello = scanner.next();
        }
    }
}
