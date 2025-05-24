package controller;

import model.entity.Reservation;

import java.time.LocalDate;

public class ReservationController {
    private static ReservationController reservationController;

    private ReservationController() {
    }

    public static ReservationController getReservationControllerInstance() {
        if (reservationController == null) {
            reservationController = new ReservationController();
        }
        return reservationController;
    }

    public void getAllRoom() {
    }

    public Reservation findReservation(String reservationCode) {
        return null;
    }

    public void deleteReservation(Reservation reservation) {
    }

    public void getAvaliableRoom() {
    }

    public void createReservation(String roomNumber, String customerName, LocalDate checkInDate, LocalDate checkOutDate) {

    }

    public void cancelReservation(Reservation reservation) {

    }
}
