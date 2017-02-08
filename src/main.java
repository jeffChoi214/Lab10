import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lab 9 by Jeff Choi 2/6/2017
*/

public class main {
    public static int getCars(Scanner sc) {
        int numCars;

        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        numCars = sc.nextInt();
        sc.nextLine();

        return numCars;
    }
    
    public static void getInput(Car[] cars, int numCars, Scanner sc) {
        for (int i = 0; i < numCars; i++) {
            String make, model, holder;
            int year;
            double price;
            
            System.out.print("Enter Car#" + i + " Make: " );
            make = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Model: ");
            model = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Year: ");
            year = sc.nextInt();
            System.out.print("Enter Car#" + i + " Price: ");
            holder = sc.next();
            sc.nextLine();
            price = Double.parseDouble(holder);
            cars[i] = new Car(make, model, year, price);
        } 
    }

    // "overloading" for arraylist of cars
    public static void getInput(ArrayList<Car> carList, int numCars, Scanner sc) {
        for (int i = 0; i < numCars; i++) {
            String make, model, holder;
            int year;
            double price;

            System.out.print("Enter Car#" + i + " Make: " );
            make = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Model: ");
            model = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Year: ");
            year = sc.nextInt();
            System.out.print("Enter Car#" + i + " Price: ");
            holder = sc.next();
            sc.nextLine();
            price = Double.parseDouble(holder);
            Car theCar = new Car(make, model, year, price);
            carList.add(theCar);
        }
    }

    public static void printOutput(Car[] cars, int numCars) {
        System.out.println("");
        System.out.println("Current Inventory:");

        for (int j = 0; j < numCars; j++) {
            cars[j].printString();
        }
    }

    public static void printOutput(ArrayList<Car> carList, int numCars) {
        System.out.println("");
        System.out.println("Current Inventory:");

        for (int i = 0; i < numCars; i++) {
            carList.get(i).printString();
        }

    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCars = getCars(sc);
        
        Car[] cars = new Car[numCars];
        ArrayList<Car> carList = new ArrayList<>();
        // getInput(cars, numCars, sc);
        getInput(carList, numCars, sc);
        // printOutput(cars, numCars);
        printOutput(carList, numCars);
    }
}
