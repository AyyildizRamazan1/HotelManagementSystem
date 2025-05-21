package controller;

import model.AdanaModel;
import model.entity.User;

public class UserController {
    private static UserController userController;
    private AdanaModel adanaModel = AdanaModel.getAdanaModelInstance();

    private UserController() {
    }

    public static UserController getUserControllerInstance() {
        if (userController == null) {
            userController = new UserController();
        }
        return userController;
    }

    public void createUser(String userName, String password, String role) {

        User user = new User();
        user.setUserName(userName);
        user.setRole(role);
        user.setPassword(password);

        int userId = adanaModel.getUserRepository().getHighestUserId() + 1;

        user.setUserId(userId);

        adanaModel.getUserRepository().getUserList().add(user);
    }

    public void deleteUser(String userName) {
    }


    public User findUserWithUserName(String userName) {
        return null;
    }

    public void updateUserName(User user, String newUserName) {
    }

    public void updatePassword(User user, String newPassword) {
    }

    public void updateRole(User user, String newRole) {
    }

    public void getAllUser() {
    }
}
