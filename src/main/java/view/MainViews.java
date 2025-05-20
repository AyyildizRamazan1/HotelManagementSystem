package view;

import model.entity.User;

public class MainViews {

    private static MainViews mainViews;

    private MainViews() {
    }

    public static MainViews getMainViewsInstance() {
        if (mainViews == null) {
            mainViews = new MainViews();
        }
        return mainViews;
    }

    public void getAdminView(User user) {
    }

    public void getReceptionistView(User user) {
    }
}
