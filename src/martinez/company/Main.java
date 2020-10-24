package martinez.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StandardRoom tomsRoom = new StandardRoom(112, "single", 2,
                58.9f, 1, 1);

        System.out.println("Room Number: " + tomsRoom.getNumber() + " Beds: " + tomsRoom.getBeds()
                + " Rooms " + tomsRoom.getRooms());
//        System.out.println(tomsRoom);
    }
}
