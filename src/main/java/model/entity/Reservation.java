package model.entity;

import java.time.LocalDate;

public class Reservation {

    private int reservationId;
    private String reservationCode;
    private String customerName;
    private Room room;
    private LocalDate checkIn;
    private LocalDate chechOut;
    private double totalCost;
    private boolean cancel;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getChechOut() {
        return chechOut;
    }

    public void setChechOut(LocalDate chechOut) {
        this.chechOut = chechOut;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public Reservation(int reservationId, String reservationCode, String customerName, Room room, LocalDate checkIn, LocalDate chechOut, double totalCost, boolean cancel) {
        this.reservationId = reservationId;
        this.reservationCode = reservationCode;
        this.customerName = customerName;
        this.room = room;
        this.checkIn = checkIn;
        this.chechOut = chechOut;
        this.totalCost = totalCost;
        this.cancel = cancel;
    }

    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", reservationCode='" + reservationCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", room=" + room +
                ", checkIn=" + checkIn +
                ", chechOut=" + chechOut +
                ", totalCost=" + totalCost +
                ", cancel=" + cancel +
                '}';
    }
}
