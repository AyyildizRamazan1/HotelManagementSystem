package view;

import model.entity.User;
import utils.ProccessUtils;

public class MainViews {

    private static MainViews mainViews;
    private ProccessUtils proccessUtils = ProccessUtils.getProccessUtilsInstance();
    private UserView userView = UserView.getUserViewInstance();
    private RoomView roomView = RoomView.getRoomViewInstance();
    private ReservationView reservationView = ReservationView.getReservationViewInstance();

    private MainViews() {
    }

    public static MainViews getMainViewsInstance() {
        if (mainViews == null) {
            mainViews = new MainViews();
        }
        return mainViews;
    }

    public void getAdminView(User user) {
        System.out.println("Welcome" + user.getUserName());

        ADMINLABEL:
        do {
            System.out.println("1. Manage User\n" +
                    "2. Manage Room\n" +
                    "3. Manage Reservation\n" +
                    "0. Logout\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    userView.getUserView();
                    break;
                case "2":
                    roomView.getRoomView();
                    break;
                case "3":
                    reservationView.getReservationView();
                    break;
                case "0":
                    break ADMINLABEL;
                default:
                    System.out.println("Invalid choice ! ");
            }

        } while (true);

    }

    public void getReceptionistView(User user) {
    }
}
