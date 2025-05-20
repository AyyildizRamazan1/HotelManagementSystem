package controller;

import model.entity.User;

public class AuthenticationController {

    private static AuthenticationController authenticationController;

    private AuthenticationController(){
    }

    public static AuthenticationController getAuthenticationControllerInstance() {
        if(authenticationController==null){
            authenticationController=new AuthenticationController();
        }
        return authenticationController;
    }

    public User loginControl(String username, String password) {
        //TODO kullanıcının ad şife kontrol edilecek alan
        return null;
    }
}
