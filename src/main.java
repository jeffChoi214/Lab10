import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lab 9 by Jeff Choi 2/6/2017
*/

public class main {
    public static int getCars(Scanner sc, Validator validate) {
        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        int numCars = validate.getInt(sc);
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
    public static void getInput(ArrayList<Car> theCars, int numCars, Scanner sc) {
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
            UsedCar testing = new UsedCar(make, model, year, price, 2828);
            theCars.add(theCar);
        }
    }

    public static void printOutput(Car[] cars, int numCars) {
        System.out.println("");
        System.out.println("Current Inventory:");

        for (int j = 0; j < numCars; j++) {
            cars[j].printString();
        }
    }

    public static void printOutput(ArrayList<Car> theCars, int numCars) {
        System.out.println("Current Inventory:");
        System.out.printf("   %-15s %-15s %-10s %-15s %-15s", "Make", "Model", "Year", "Price", "Mileage (Used)");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < numCars; i++) {
            System.out.print((i + 1) + ". ");
            theCars.get(i).printString();
        }

        System.out.println((numCars + 1) + ". Quit");
        System.out.println("");
    }

    public static ArrayList<Car> generateCars() {
        ArrayList<Car> carList = new ArrayList<>();
        Car newOne = new Car("Ford", "Escape", 2004, 12999);
        Car newTwo = new Car("Toyota", "Camry", 2011, 21999);
        Car newThree = new Car("Mercedes", "GLK", 2011, 39500);
        UsedCar usedOne = new UsedCar("Honda", "Pilot", 2009, 12000, 60000);
        UsedCar usedTwo = new UsedCar("Honda", "Civic", 2014, 22999, 20000);
        UsedCar usedThree = new UsedCar("BMW", "335i", 2016, 39999, 999);

        carList.add(newOne);
        carList.add(newTwo);
        carList.add(newThree);
        carList.add(usedOne);
        carList.add(usedTwo);
        carList.add(usedThree);

        return carList;
    }


    public static void main (String[] args) {
        Validator validate = new Validator();
        Scanner sc = new Scanner(System.in);
        int userInput;
        char toBuy;
        ArrayList<Car> carList = generateCars();

        while (true) {
            printOutput(carList, carList.size());

            // ask user which they would like to buy
            System.out.println("Which car would you like?(Choose a number): ");
            userInput = validate.getInt(sc);
            
            if (userInput == carList.size() + 1) {
                System.out.println("Have a great day!");
                break;
            }

            carList.get(userInput - 1).printString();

            System.out.println("Would you like to buy this car?(y/n): ");
            toBuy = validate.getYesNo(sc);

            if (toBuy == 'y' || toBuy == 'Y') {
                carList.remove(userInput - 1);
                System.out.println("Excellent! Our finalce department will be in touch shortly!");
            }

            System.out.println("");
        }
    }
}
