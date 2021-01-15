
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random randomizeNumbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers = new Random();
        this.numbers = new ArrayList<>();
        int alpha = 7;
        while(alpha!=0){
            int add = randomizeNumbers.nextInt(40)+1;
            if(numbers.contains(add)){
                continue;
            } else{
                numbers.add(add);
                alpha-=1;
            }
        }
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        int alpha = 7;
        while(alpha!=0){
            int add = randomizeNumbers.nextInt(40)+1;
            if(numbers.contains(add)){
                continue;
            } else{
                numbers.add(add);
                alpha-=1;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(numbers.contains(number)){
            return true;
        }
        return false;
    }
}

