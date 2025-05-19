package model.repository;

import model.entity.Room;
import model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> roomList = new ArrayList<>();

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public int getHighestUserId() {
        int highestId = 0;
        if (!roomList.isEmpty()) {
            for (Room room : roomList) {
                highestId = Math.max(highestId, room.getRoomId());
            }
        }
        return highestId;
    }
}
