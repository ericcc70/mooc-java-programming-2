
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object o) {

        // If the object is compared with itself then return true   
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Item)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members  
        Item c = (Item) o;

        // Compare the data members and return accordingly  
        if(c.name.equals(this.name)){
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

}
