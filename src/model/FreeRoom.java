package model;

public class FreeRoom  extends Room{


    public FreeRoom(String roomNumber, Double price, RoomType roomType) {
        super(roomNumber, price = 0.0, roomType);
    }

    @Override
    public String toString() {
        return "FreeRoom{}";
    }
}
