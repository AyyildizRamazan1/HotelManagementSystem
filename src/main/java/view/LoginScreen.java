package view;

import controller.AuthenticationController;
import model.entity.User;
import utils.ProccessUtils;

public class LoginScreen {

    private static LoginScreen loginScreen;
    private ProccessUtils proccessUtils = ProccessUtils.getProccessUtilsInstance();
    private AuthenticationController authenticationController = AuthenticationController.getAuthenticationControllerInstance();
    private MainViews mainViews = MainViews.getMainViewsInstance();

    private LoginScreen() {
    }

    public static LoginScreen getLoginScreenInstance() {
        if (loginScreen == null) {
            loginScreen = new LoginScreen();
        }
        return loginScreen;
    }

    public void loginView() {
        do {
            System.out.println("Welcome to Our Hotel Application !");
            System.out.print("Please enter you username : ");
            String username = proccessUtils.scanner.nextLine();
            System.out.print("Please enter you password : ");
            String password = proccessUtils.scanner.nextLine();

            User user = authenticationController.loginControl(username,password);

            if (!(user == null)) {

                if (user.getRole().equals("Admin")) {
                    mainViews.getAdminView(user);
                } else if (user.getRole().equals("Receptionist")) {
                    mainViews.getReceptionistView(user);
                } else {
                    System.out.println("Invalid Role !");
                }
            } else {
                System.out.println("Username or Password is not correct!");
            }

            System.out.println("Do you want exit? (Y/N)");
            String choise=proccessUtils.scanner.nextLine();

            if(choise.toUpperCase().equals("Y")){
                System.exit(0);
                //break;
            }

        }while(true);

    }
}
