
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for(Book each:hashmap.values()){
            System.out.println(each);
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book each:hashmap.values()){
            if(each.getName().contains(text)){
                System.out.println(each);
            }
            
        }
    }

}
