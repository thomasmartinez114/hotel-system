package martinez.company;

public class StandardRoom extends Room {

    // Instance Fields || Variables
    private int rooms;
    private int beds;

    // Call super to allow to extend with the Constructors
    public StandardRoom(int roomNumber, String type, int floor, float averagePrice, int rooms, int beds) {
        super(roomNumber, type, floor, averagePrice); // Inheriting from parent class must always be first

        // Assigning variables
        this.rooms = rooms;
        this.beds = beds;
    }

    @Override //Override reserveRoom from parent class
    public boolean reserveRoom(Client occupant) {

//        if(occupant.getPartySize() > this.beds * 2) {
//            System.out.println("Rooms is unavailable");
//            return false;
//        }

        if(2 > this.beds * 2) {
            System.out.println("Rooms is unavailable");
            return false;
        }
        return super.reserveRoom(occupant);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

//    @Override
//    public String toString() {
//        return "StandardRoom{" +
//                "rooms=" + rooms +
//                ", beds=" + beds +
//                '}';
//    }
}
