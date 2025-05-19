package model.entity;

import java.time.LocalDate;

public class Reservation {

    private int reservationId;
    private String customerName;
    private Room room;
    private LocalDate checkIn;
    private LocalDate chechOut;
    private double totalCost;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
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

    public Reservation(int reservationId, String customerName, Room room, LocalDate checkIn, LocalDate chechOut, double totalCost) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.room = room;
        this.checkIn = checkIn;
        this.chechOut = chechOut;
        this.totalCost = totalCost;
    }

    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customerName='" + customerName + '\'' +
                ", room=" + room +
                ", checkIn=" + checkIn +
                ", chechOut=" + chechOut +
                ", totalCost=" + totalCost +
                '}';
    }
}
