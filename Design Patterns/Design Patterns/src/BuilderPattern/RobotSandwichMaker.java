package BuilderPattern;

import java.util.Scanner;

public class RobotSandwichMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Robot Sandwich Maker!");

        System.out.print("Choose your bread (Wheat, Rye, Space Bread): ");
        String bread = scanner.nextLine();

        System.out.print("Choose your protein (Chicken, Beef, Space Tofu): ");
        String protein = scanner.nextLine();

        System.out.print("Choose your cheese (Cheddar, Swiss, Moon Cheese): ");
        String cheese = scanner.nextLine();

        System.out.print("Choose your sauce (Ketchup, Mustard, Spicy Meteor Sauce): ");
        String sauce = scanner.nextLine();

        System.out.print("Any extras (Lettuce, Tomato, Crunchy Moon Dust): ");
        String extras = scanner.nextLine();

        // Use the Builder to create a Sandwich
        Sandwich sandwich = new Sandwich.SandwichBuilder()
                .setBread(bread)
                .setProtein(protein)
                .setCheese(cheese)
                .setSauce(sauce)
                .setExtras(extras)
                .build();

        System.out.println("\nYour custom sandwich is ready:");
        System.out.println(sandwich);

        scanner.close();
    }
}
