
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {Files.lines(Paths.get("literacy.csv"))
                // splitting the row into parts on the ";" character
                .map(row -> row.split(","))
                .sorted((p1, p2)->{return p1[5].compareTo(p2[5]);})
                .forEach(person -> System.out.println(person[3]+" ("+person[4]+"), "+person[2].split(" ")[1]+", "+person[5]));
        } catch (Exception e) {
                System.out.println("Could not read the specified file.");
        }
    }
}
