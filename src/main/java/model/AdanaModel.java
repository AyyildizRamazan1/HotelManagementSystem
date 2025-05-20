package model;

import model.repository.ReservationRepository;
import model.repository.RoomRepository;
import model.repository.UserRepository;

public class AdanaModel extends BaseModel {

    private UserRepository userRepository = new UserRepository();
    private RoomRepository roomRepository = new RoomRepository();
    private ReservationRepository reservationRepository = new ReservationRepository();

    private static AdanaModel adanaModel;

    private AdanaModel() {
    }

    public static AdanaModel getAdanaModelInstance() {
        if (adanaModel == null) {
            adanaModel = new AdanaModel();
        }
        return adanaModel;
    }

    @Override
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public RoomRepository getroomRepository() {
        return roomRepository;
    }

    @Override
    public ReservationRepository getReservationRepository() {
        return reservationRepository;
    }
}
