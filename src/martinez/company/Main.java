package martinez.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StandardRoom tomsRoom = new StandardRoom(112, "single", 2,
                58.9f, 1, 1);

        SuiteRoom tomSuite = new SuiteRoom(300, "double", 4, 150.5f, 2, 2, true);

        System.out.println("Room Number: " + tomsRoom.getRoomNumber() + " Beds: " + tomsRoom.getBeds()
                + " Rooms " + tomsRoom.getRooms());
        System.out.println("Standard Room: " + tomsRoom);

        System.out.println("Suite: " + tomSuite);
    }
}
