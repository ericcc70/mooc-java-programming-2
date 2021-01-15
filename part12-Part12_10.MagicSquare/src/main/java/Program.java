
import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        int[][] t = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MagicSquare ms = new MagicSquare(3);
        ms = ms.createMagicSquare(t);

        ArrayList<Integer> sumsOfDiagonals = ms.sumsOfDiagonals();
        System.out.println(sumsOfDiagonals);
    }
    
}
