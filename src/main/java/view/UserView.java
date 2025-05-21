package view;

import controller.UserController;
import model.entity.User;
import utils.ProccessUtils;

public class UserView {

    private static UserView userView;
    private ProccessUtils proccessUtils = ProccessUtils.getProccessUtilsInstance();
    private UserController userController = UserController.getUserControllerInstance();

    private UserView() {
    }

    public static UserView getUserViewInstance() {
        if (userView == null) {
            userView = new UserView();
        }
        return userView;
    }

    public void getUserView() {
        USERVIEW:
        while (true) {

            System.out.println("1. Add User\n" +
                    "2. Get All User\n" +
                    "3. Update User\n" +
                    "4. Delete User\n" +
                    "5. Find User\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    addUserView();
                    break;
                case "2":
                    getAllUser();
                    break;
                case "3":
                    updateUser();
                    break;
                case "4":
                    deleteUser();
                    break;
                case "5":
                    findUser();

                case "0":
                    break USERVIEW;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }
    }

    private void findUser() {
        System.out.println("Please enter username : ");
        String userName = proccessUtils.scanner.nextLine();

        User user =userController.findUserWithUserName(userName);
        System.out.println(user);
    }

    private void deleteUser() {
        System.out.println("Please enter username to delete : ");
        String userName = proccessUtils.scanner.nextLine();

        userController.deleteUser(userName);
    }

    private void updateUser() {
        System.out.println("Please enter userName to update : ");
        String userName = proccessUtils.scanner.nextLine();

        User user = userController.findUserWithUserName(userName);

        if (!(user == null)) {
            System.out.print("1.UserName\n" +
                    "2. Password\n" +
                    "3. Role\n" +
                    "0. Back" +
                    "Please Select: ");
            String choise = proccessUtils.scanner.nextLine();

            switch (choise) {
                case "1":
                    System.out.println("Please Enter New UserName: ");
                    String newUserName = proccessUtils.scanner.nextLine();
                    userController.updateUserName(user, newUserName);
                    break;
                case "2":
                    System.out.println("Please Enter New Password: ");
                    String newPassword = proccessUtils.scanner.nextLine();
                    userController.updatePassword(user, newPassword);
                    break;
                case "3":
                    String newRole;
                    NEWROLE:
                    while (true) {
                        System.out.println("1. Admin\n" +
                                "2. Receptionist\n" +
                                "Please Select New Role: ");

                        String newRoleChoise = proccessUtils.scanner.nextLine();

                        if (newRoleChoise.equals("1")) {
                            newRole = "Admin";
                            break NEWROLE;
                        } else if (newRoleChoise.equals("2")) {
                            newRole = "Receptionist";
                            break NEWROLE;
                        } else {
                            newRole = " ";
                            System.out.println("Invalid Choice ! ");
                        }
                    }
                    userController.updateRole(user, newRole);
                case "0":
                default:
                    System.out.println("Invalid Choice !");
            }
        }
    }

    private void getAllUser() {
        userController.getAllUser();
    }

    private void addUserView() {
        System.out.println("Please Enter UserName:");
        String userName = proccessUtils.scanner.nextLine();

        System.out.println("Please Enter Password:");
        String password = proccessUtils.scanner.nextLine();

        String role;
        ROLE:
        while (true) {
            System.out.println("1. Admin\n" +
                    "2. Receptionist\n" +
                    "Please Select: ");

            String choise = proccessUtils.scanner.nextLine();

            if (choise.equals("1")) {
                role = "Admin";
                break ROLE;
            } else if (choise.equals("2")) {
                role = "Receptionist";
                break ROLE;
            } else {
                role = " ";
                System.out.println("Invalid Choice ! ");
            }
        }

        userController.createUser(userName, password, role);
    }

}
