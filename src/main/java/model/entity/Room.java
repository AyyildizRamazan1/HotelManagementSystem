package model.entity;

public class Room {

    private int roomId;
    private String roomNumber;
    private String category;
    private int capacity;
    private double price;
    private boolean reserved;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Room(int roomId, String roomNumber, String category, int capacity, double price, boolean reserved) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.category = category;
        this.capacity = capacity;
        this.price = price;
        this.reserved = reserved;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber='" + roomNumber + '\'' +
                ", category='" + category + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", reserved=" + reserved +
                '}';
    }
}
