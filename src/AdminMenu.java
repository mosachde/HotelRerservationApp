import model.IRoom;
import model.Room;
import model.RoomType;

import java.util.Scanner;

public class AdminMenu {

              private Scanner scanner = new Scanner(System.in);
//

               public void process(){

                System.out.println("1. See All Customers");
                System.out.println("2. See All Rooms");
                System.out.println("3. See All Reservations ");
                System.out.println("4. Add a Room");
                System.out.println("5.  Back to Main Menu");

                System.out.println(" Please Enter your Choice");
                int valueEntered = scanner.nextInt();


                switch (valueEntered){

                    case 4:
                        addARoom();
                        process();

                    case 5:
                        return;


                }




               }

    private void addARoom() {

        System.out.println(" Please Enter a RoomNumber");
        scanner.nextLine();
        String roomNumber = scanner.nextLine();

        System.out.println(" Please Enter Price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please Enter a Room Type  1 for Single Bed, 2 For Double");
        String roomType = scanner.nextLine();
        RoomType type;
        if(roomType.equals("1")) {
            type = RoomType.SINGLE;
        }else {
            type = RoomType.DOUBLE;
        }

        IRoom room = new Room(roomNumber,price, type);
        System.out.println("Successfully Created Room ");
    }


}
