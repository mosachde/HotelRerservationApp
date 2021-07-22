import api.HotelResource;
import service.CustomerService;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        var service = new CustomerService();
        var hotelResource = new HotelResource(service);

        while (true) {
            System.out.println(" 1. Find & Reserve A Room");
            System.out.println(" 2. See All My Reservations");
            System.out.println(" 3. Create an Account");
            System.out.println(" 4. Admin");
            System.out.println(" 5. Exit");


            System.out.println(" Please Enter one of the options");
            int valueEntered = Integer.parseInt(scanner.nextLine());

            switch (valueEntered){

                case 1:
                    System.out.println("Please Enter in Checkin Date");
                    String checkInDate = scanner.nextLine();

                    System.out.println("Please Enter in Checkout Date");
                    String checkOutDate = scanner.nextLine();




                case 3:
                    new MainMenu().addAccount(scanner,hotelResource);
                    continue;

                case  4:
                    new AdminMenu().process();

            }

            if (valueEntered == 5) {
                System.out.println(" Exiting Shitty While Loop");
                break;
            }
            continue;
        }

    }
}
