package controller;

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
}
