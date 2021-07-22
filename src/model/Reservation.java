package model;

import java.util.Date;

public class Reservation {

    Customer customer;
    IRoom iRoom;
    Date checkInDate;
    Date checOutDate;


    public Reservation(Customer customer, IRoom iRoom, Date checkInDate, Date checOutDate) {
        this.customer = customer;
        this.iRoom = iRoom;
        this.checkInDate = checkInDate;
        this.checOutDate = checOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public IRoom getiRoom() {
        return iRoom;
    }

    public void setiRoom(IRoom iRoom) {
        this.iRoom = iRoom;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getChecOutDate() {
        return checOutDate;
    }

    public void setChecOutDate(Date checOutDate) {
        this.checOutDate = checOutDate;
    }
}
