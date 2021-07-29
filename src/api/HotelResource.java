package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.exception.CustomerAlreadyExistException;
import service.CustomerService;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    private CustomerService service;

    public HotelResource(CustomerService service) {
        this.service = service;
    }

    public Customer getCustomer(String email){
        return null;
    }

    public void createACustomer(String email, String firstName, String lastName) throws CustomerAlreadyExistException {

        service.addCustomer(email,firstName,lastName);

    }

    public IRoom getRoom(String roomNumber ){
            return null;
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return null;
    }

    public Collection<Reservation> getCustomerReservations(String customerEmail){
        return null;
    }

    public  Collection<IRoom> findARoom(Date checkInDate , Date checkOutDate) {
            return null;
    }


}
