package martinez.company;

public class Room {

    // Instance Fields || Variables
    private int number;
    private String type;
    private int floor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private Client occupant;
    private float averagePrice;

    // Constructor
    public Room(int number, String type, int floor, float averagePrice) {
        this.number = number;
        this.type = type;
        this.floor = floor;
        this.averagePrice = averagePrice;
    }

    // Getter Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", floor=" + floor +
                ", isOccupied=" + isOccupied +
                ", needsCleaning=" + needsCleaning +
                ", occupant=" + occupant +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
