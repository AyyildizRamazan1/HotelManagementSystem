package view;

public class RoomView {

    private static RoomView roomView;

    private RoomView() {
    }

    public static RoomView getRoomViewInstance() {
        if (roomView == null) {
            roomView = new RoomView();
        }
        return roomView;
    }

    public void getRoomView() {
        System.out.println("Henüz method hazır değil ancak çalışıyor");
    }
}
