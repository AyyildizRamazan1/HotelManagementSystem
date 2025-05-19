package model.repository;

import model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getHighestUserId() {
        int highestId = 0;
        if (!userList.isEmpty()) {
            for (User user : userList) {
                highestId = Math.max(highestId, user.getUserId());
            }
        }
        return highestId;
    }
}
