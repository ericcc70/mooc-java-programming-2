
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("")){
                break;
            }
            int answer1 = Integer.valueOf(scanner.nextLine());
            books.add(new Book(answer, answer1));
        }
        int size = books.size();
        System.out.println(size+" books in total.");
        System.out.println();
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        for(Book e: books){
            System.out.println(e);
        }

    }

}
