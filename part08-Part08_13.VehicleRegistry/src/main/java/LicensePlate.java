
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(object instanceof LicensePlate)) {
            return false;
        }

        // let's convert the object to a Book-object
        LicensePlate compared = (LicensePlate) object;

        // if the instance variables of the objects are the same, so are the objects
        if (this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    public int hashCode() {

        if (this.country == null) {
            return this.liNumber.hashCode();
        }

        return this.liNumber.hashCode() + this.country.hashCode();
    }

}
