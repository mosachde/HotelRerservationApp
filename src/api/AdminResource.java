package api;

import model.Customer;
import model.IRoom;
import service.CustomerService;

import java.util.Collection;
import java.util.List;

public class AdminResource {


    private static CustomerService service;


    public AdminResource(CustomerService service) {
        this.service = service;
    }

    public Customer getCustomer(String email) {

      return service.getCustomer(email);
    }

    public void addRoom(List<IRoom> room) {
        //TODDO
    }

    public Collection<IRoom> getAllRooms(){
        //TO DO
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    public void displayAllReservations(){

        // TODO
    }


}
