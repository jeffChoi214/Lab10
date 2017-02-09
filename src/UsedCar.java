import java.text.NumberFormat;

/*
 * Lab 9 Car Used Class File
*/

public class UsedCar extends Car {
    private int miles;

    public UsedCar(String theMake, String theModel, int theYear, double thePrice, int theMiles) {
        this.make = theMake;
        this.model = theModel;
        this.year = theYear;
        this.price = thePrice;
        this.miles = theMiles;
    }


    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void printString() {
        System.out.printf("%-15s %-15s %-10d %-10f %-10d" , make, model, year, price, miles);
        System.out.println("");
    }
}
