package view;


import controller.RoomController;
import model.entity.Room;
import utils.ProccessUtils;

public class RoomView {

    private static RoomView roomView;
    private ProccessUtils proccessUtils = ProccessUtils.getProccessUtilsInstance();
    private RoomController roomController = RoomController.getRoomControllerInstance();


    private RoomView() {
    }

    public static RoomView getRoomViewInstance() {
        if (roomView == null) {
            roomView = new RoomView();
        }
        return roomView;
    }

    public void getAdminRoomView() {
        ADMINROOMVIEW:
        while (true) {

            System.out.println("1. Add Room\n" +
                    "2. Get All Room\n" +
                    "3. Update Room\n" +
                    "4. Delete Room\n" +
                    "5. Find Room\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    addRoomView();
                    break;
                case "2":
                    roomController.getAllRoom();
                    break;
                case "3":
                    updateRoom();
                    break;
                case "4":
                    deleteRoom();
                    break;
                case "5":
                    findRoom();

                case "0":
                    break ADMINROOMVIEW;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }
    }

    public void getReceptionistRoomView() {
        RECEPTIONISTROOMVIEW:
        while (true) {

            System.out.println("1. Get All Room\n" +
                    "2. Update Room Status\n" +
                    "3. Find Room\n" +
                    "Please Select : ");
            String choice = proccessUtils.scanner.nextLine();

            switch (choice) {
                case "1":
                    roomController.getAllRoom();
                    break;
                case "2":
                    updateRoomStatus();
                    break;
                case "3":
                    findRoom();
                    break;
                case "0":
                    break RECEPTIONISTROOMVIEW;
                default:
                    System.out.println("Invalid choice ! ");
            }
        }
    }

    private void findRoom() {
        System.out.print("Please Enter RoomNumber: ");
        String roomNumber = proccessUtils.scanner.next();

        Room room = roomController.findRoom(roomNumber);

        System.out.println(room);
    }

    private void deleteRoom() {
        System.out.print("Please Enter RoomNumber: ");
        String roomNumber = proccessUtils.scanner.next();

        Room room = roomController.findRoom(roomNumber);

        if (!(room == null)) {
            roomController.deleteRoom(room);
        } else {
            System.out.println("Room not found! ");
        }
    }

    private void updateRoom() {
        System.out.print("Please Enter RoomNumber: ");
        String roomNumber = proccessUtils.scanner.next();

        Room room = roomController.findRoom(roomNumber);

        if (!(room == null)) {
            System.out.println("Please Enter New RoomNumber: ");
            String newRoomNumber = proccessUtils.scanner.next();
            if (newRoomNumber.equalsIgnoreCase("cancel")) {
                return;
            }

            System.out.println("Please Enter New Category: ");
            String newCategory = proccessUtils.scanner.next();
            if (newCategory.equalsIgnoreCase("cancel")) {
                return;
            }
            int newIntCapacity;
            while (true) {
                System.out.println("Please Enter New Capacity: ");
                String newCapacityString = proccessUtils.scanner.next();
                if (newCapacityString.equalsIgnoreCase("cancel")) {
                    return;
                }
                try {
                    newIntCapacity = Integer.parseInt(newCapacityString);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter integer value! ");
                }
            }

            double doubleNewPrice;
            while (true) {
                System.out.println("Please Enter New Price: ");
                String price = proccessUtils.scanner.next();
                if (price.equalsIgnoreCase("cancel")) {
                    return;
                }
                try {
                    doubleNewPrice = Double.parseDouble(price);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter double value!");
                }
            }

            updateRoomStatus();

        } else {
            System.out.println("Room not found! ");
        }
    }

    private void addRoomView() {

        System.out.println("Please Enter Room Number: ");
        String roomNumber = proccessUtils.scanner.next();

        System.out.println("Please Enter Category: ");
        String category = proccessUtils.scanner.next();

        int intCapacity;
        while (true) {
            System.out.println("Please Enter Capacity: ");
            String capacity = proccessUtils.scanner.next();

            try {
                intCapacity = Integer.parseInt(capacity);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer value! ");
            }
        }

        double doublePrice;
        while (true) {
            System.out.println("Please Enter Price: ");
            String price = proccessUtils.scanner.next();
            try {
                doublePrice = Double.parseDouble(price);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter double value!");
            }
        }


        boolean reserved;
        AVAILABLECHOISE:
        while (true) {
            System.out.println("1. Available\n" +
                    "2. Not Available\n" +
                    "Please Enter RoomStatus: ");
            String status = proccessUtils.scanner.next();
            switch (status) {
                case "1":
                    reserved = false;
                    break AVAILABLECHOISE;
                case "2":
                    reserved = true;
                    break AVAILABLECHOISE;
                default:
                    System.out.println("Invalid Choice! ");
            }
        }

        roomController.createRoom(roomNumber, category, intCapacity, doublePrice, reserved);

    }

    private void updateRoomStatus() {

        boolean newAvailable;
        NEWAVAILABLECHOISE:
        while (true) {
            System.out.println("1. Available\n" +
                    "2. Not Available\n" +
                    "Please Enter New RoomStatus: ");
            String status = proccessUtils.scanner.next();

            if (status.equalsIgnoreCase("cancel")) {
                return;
            }

            switch (status) {
                case "1":
                    newAvailable = false;
                    break NEWAVAILABLECHOISE;
                case "2":
                    newAvailable = true;
                    break NEWAVAILABLECHOISE;
                default:
                    System.out.println("Invalid Choice! ");
            }
        }

    }
}
