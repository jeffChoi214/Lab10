import java.text.NumberFormat;

/*
 * Lab 9 Car Class File
*/

public class Car {
    String make;
    String model;
    int year;
    double price;
    static NumberFormat df = NumberFormat.getCurrencyInstance();

    public Car() {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String theMake, String theModel, int theYear, double thePrice) {
        this.make = theMake;
        this.model = theModel;
        this.year = theYear;
        this.price = thePrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String theMake) {
        this.make = theMake; 
    }

    public void setModel(String theModel) {
        model = theModel;
    }

    public void setYear(int theYear) {
        year = theYear;
    }

    public void setPrice(double thePrice) {
        price = thePrice;
    }

    public void printString() {
        System.out.printf("%-15s %-15s %-10d %-10s" , make, model, year, df.format(price));
        System.out.println("");
    }
} 
