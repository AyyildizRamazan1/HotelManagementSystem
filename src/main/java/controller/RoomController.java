package controller;

import model.entity.Room;

public class RoomController {
    private static RoomController roomController;

    private RoomController() {
    }

    public static RoomController getRoomControllerInstance() {
        if (roomController == null) {
            roomController = new RoomController();
        }
        return roomController;
    }

    public void createRoom(String roomNumber, String category, int intCapacity, double doublePrice, boolean reserved) {
    }

    public void getAllRoom() {

    }

    public Room findRoom(String roomNumber) {
        return null;
    }

    public void deleteRoom(Room room) {
    }
}
