package controller;

public class ReservationController {
    private static ReservationController reservationController;

    private ReservationController(){
    }

    public static ReservationController getReservationControllerInstance() {
        if(reservationController==null){
            reservationController=new ReservationController();
        }
        return reservationController;
    }
}
