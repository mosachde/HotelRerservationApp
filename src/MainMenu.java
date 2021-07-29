import api.HotelResource;
import model.exception.CustomerAlreadyExistException;

import java.util.Scanner;

public class MainMenu {


    public void addAccount(Scanner scanner, HotelResource hotelResource){

        System.out.println("Enter Email Format: name@domain.com");
        String email = scanner.nextLine();
        System.out.println("First Name");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();

        try {
            hotelResource.createACustomer(email,firstName,lastName);
            System.out.println(" Account Created Successfully for " + firstName);
        } catch (CustomerAlreadyExistException e) {
            System.out.println(e.getMessage());
        }


    }


}
