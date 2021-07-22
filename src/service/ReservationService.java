package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;

public class ReservationService {


    private static List<IRoom> rooms = new ArrayList<>();
    private static Map<String, Reservation> reservationMap = new HashMap<>();
    private static List<Reservation> reservationList = new ArrayList<>();

    public void addRoom(IRoom room) {
        rooms.add(room);
    }

    public IRoom getARoom(String roomId) {

        for (IRoom _room : rooms) {
            if (_room.getRoomNumber().equals(roomId)) {
                return _room;
            }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {



    }

    public Collection<Reservation> getCustomerReservation(Customer customer) {
        return null;
    }

    public void printAllReservations() {


    }


    public Collection<IRoom> getAvailableRooms(Date checkInDate ,Date checkOutDate){

        ArrayList<IRoom> availableRooms = new ArrayList<>();

        for ( IRoom room:rooms) {
            for (Reservation reservation:reservationList) {
                if(! room.getRoomNumber().equals(reservation.getiRoom().getRoomNumber())) {
                    availableRooms.add(room);

                }else{

                }


            }

        }
    }

}
