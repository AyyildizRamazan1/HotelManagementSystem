package view;

public class ReservationView {

    private static ReservationView reservationView;

    private ReservationView() {
    }

    public static ReservationView getReservationViewInstance() {
        if (reservationView == null) {
            reservationView = new ReservationView();
        }
        return reservationView;
    }

    public void getAdminReservationView() {
        System.out.println("Henüz method hazır değil ancak çalışıyor");
    }

    public void getReceptionistReservationView() {

    }
}
