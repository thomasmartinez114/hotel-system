package martinez.company;

public class Room {

    // Instance Fields || Variables
    private int roomNumber;
    private String roomType;
    private int floor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private Client occupant;
    private float averagePrice;

    // Constructor
    public Room(int roomNumber, String type, int floor, float averagePrice) {
        this.roomNumber = roomNumber;
        this.roomType = type;
        this.floor = floor;
        this.occupant = null;
        this.averagePrice = averagePrice;
    }

    // cleanRoom method
    public void cleanRoom() {
        if (!needsCleaning)
            this.needsCleaning = true;
    }

    // Reserve method
    public boolean reserveRoom(Client occupant) {
        // conditions
            // if room is occupied then return false
            // if occupant already has a room reserved
            // if room needs cleaning
        if (isOccupied && needsCleaning){
            System.out.println("unavailable");
            cleanRoom(); // set to clean the room
            return false;
        }
            this.occupant = occupant; // set occupant to the occupant passed in method
            this.isOccupied = true;
            // Update client bill to avg price
            return true;
    }

    // Checkout method
    public void checkoutRoom(Client occupant) {
        // remove client from object
        this.occupant = null;

        // mark isOccupied as false
        this.isOccupied = false;

        // set needsCleaning to true
        this.needsCleaning = true;
    }

    // Getter Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return roomType;
    }

    public void setType(String type) {
        this.roomType = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isNeedsCleaning() {
        return needsCleaning;
    }

    public void setNeedsCleaning(boolean needsCleaning) {
        this.needsCleaning = needsCleaning;
    }

    public Client getOccupant() {
        return occupant;
    }

    public void setOccupant(Client occupant) {
        this.occupant = occupant;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    // Print the object as Strings
    @Override
    public String toString() {
        return "Room{" +
                "number=" + roomNumber +
                ", type='" + roomType + '\'' +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", needsCleaning=" + needsCleaning +
                ", occupant=" + occupant +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
