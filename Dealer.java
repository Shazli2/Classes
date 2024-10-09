import java.util.ArrayList;
import java.util.Scanner;


public class Dealer {
    private String name;

    public Dealer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void menu() {
        // The logic for Dealer's specific menu goes here
        System.out.println("Welcome to " + name + "'s menu.");
        // Implement dealer-specific options here
    }
}
