package model.repository;

import model.entity.Reservation;
import model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {

    private List<Reservation> reservationList=new ArrayList<>();

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public int getHighestUserId() {
        int highestId = 0;
        if (!reservationList.isEmpty()) {
            for (Reservation reservation : reservationList) {
                highestId = Math.max(highestId, reservation.getReservationId());
            }
        }
        return highestId;
    }
}
