package view;

public class UserView {

    private static UserView userView;

    private UserView() {
    }

    public static UserView getUserViewInstance() {
        if (userView == null) {
            userView = new UserView();
        }
        return userView;
    }

    public void getUserView() {
        System.out.println("Henüz method hazır değil ancak çalışıyor");
    }
}
