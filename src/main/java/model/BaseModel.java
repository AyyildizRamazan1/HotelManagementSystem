package model;

import model.entity.Reservation;
import model.repository.ReservationRepository;
import model.repository.RoomRepository;
import model.repository.UserRepository;

public abstract class BaseModel {

    public abstract UserRepository getUserRepository();

    public abstract RoomRepository getroomRepository();

    public abstract ReservationRepository getReservationRepository();
}
