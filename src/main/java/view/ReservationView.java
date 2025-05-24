package view;

import controller.ReservationController;
import model.entity.Reservation;
import utils.ProccessUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationView {

    private static ReservationView reservationView;
    private ProccessUtils proccessUtils = ProccessUtils.getProccessUtilsInstance();
    private ReservationController reservationController = ReservationController.getReservationControllerInstance();

    private ReservationView() {
    }

    public static ReservationView getReservationViewInstance() {
        if (reservationView == null) {
            reservationView = new ReservationView();
        }
        return reservationView;
    }

    public void getAdminReservationView() {

        ADMINRESERVATIONROOMVIEW:
        while (true) {

            System.out.println("1. Add Reservation\n" +
                    "2. Get All Reservation\n" +
                    "3. Update Reservation\n" +
                    "4. Delete Reservation\n" +
                    "5. Find Reservation\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    addReservationView();
                    break;
                case "2":
                    reservationController.getAllRoom();
                    break;
                case "3":
                    updateReservation();
                    break;
                case "4":
                    deleteReservation();
                    break;
                case "5":
                    findReservation();

                case "0":
                    break ADMINRESERVATIONROOMVIEW;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }
    }

    private void findReservation() {

        System.out.println("Please Enter Reservation Code :");
        String reservationCode = proccessUtils.scanner.nextLine();

        Reservation reservation = reservationController.findReservation(reservationCode);

        if (reservation != null) {
            System.out.println(reservation);
        } else {
            System.out.println("Reservation Not Found !");
        }

    }

    private void updateReservation() {
    }

    private void deleteReservation() {

        System.out.println("Please Enter Reservation Code :");
        String reservationCode = proccessUtils.scanner.nextLine();

        Reservation reservation = reservationController.findReservation(reservationCode);

        if (reservation != null) {
            reservationController.deleteReservation(reservation);
        } else {
            System.out.println("Reservation Not Found !");
        }

    }

    private void addReservationView() {

        reservationController.getAvaliableRoom();
        String roomNumber = proccessUtils.scanner.nextLine();

        System.out.print("Please Enter Customer Name: ");
        String customerName = proccessUtils.scanner.nextLine();

        System.out.println("Please Enter Check-in Date(yyyy-MM-dd)");
        String checkIn = proccessUtils.scanner.nextLine();

        LocalDate checkInDate = checkDate(checkIn);

        System.out.println("Please Enter Check-out Date(yyyy-MM-dd)");
        String checkOut = proccessUtils.scanner.nextLine();

        LocalDate checkOutDate = checkDate(checkOut);

        reservationController.createReservation(roomNumber, customerName, checkInDate, checkOutDate);

    }

    private LocalDate checkDate(String checkIn) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while (true) {
            try {
                LocalDate checkInDate = LocalDate.parse(checkIn, dateTimeFormatter);
                return checkInDate;
            } catch (Exception e) {
                System.out.println("Please Enter Valid Date !");
            }
        }
    }

    public void getReceptionistReservationView() {

        RECEPTIONISTRESERVATIONROOMVIEW:
        while (true) {

            System.out.println("1. Add Reservation\n" +
                    "2. Get All Reservation\n" +
                    "3. Update Reservation\n" +
                    "4. Cancel Reservation\n" +
                    "5. Find Reservation\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    addReservationView();
                    break;
                case "2":
                    reservationController.getAllRoom();
                    break;
                case "3":
                    updateReservation();
                    break;
                case "4":
                    cancelReservation();
                    break;
                case "5":
                    findReservation();

                case "0":
                    break RECEPTIONISTRESERVATIONROOMVIEW;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }
    }

    private void cancelReservation() {
        System.out.println("Please Enter Reservation Code :");
        String reservationCode = proccessUtils.scanner.nextLine();

        Reservation reservation = reservationController.findReservation(reservationCode);
        if (reservation != null) {
            reservationController.cancelReservation(reservation);
        } else {
            System.out.println("Reservation Not Found !");
        }
    }
}
