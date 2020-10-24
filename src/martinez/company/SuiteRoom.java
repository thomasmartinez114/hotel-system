package martinez.company;

public class SuiteRoom {

    // Instance Fields || Variables
    private String type;
    private int rooms;
    private int beds;
    private boolean kitchenette = true;
    private boolean needsRestock = false;

    // Constructor
    public SuiteRoom(String type, int rooms, int beds) {
        this.type = type;
        this.rooms = rooms;
        this.beds = beds;
    }

    // reStock method
    public void reStock() {
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isKitchenette() {
        return kitchenette;
    }

    public void setKitchenette(boolean kitchenette) {
        this.kitchenette = kitchenette;
    }

    public boolean isNeedsRestock() {
        return needsRestock;
    }

    public void setNeedsRestock(boolean needsRestock) {
        this.needsRestock = needsRestock;
    }
}
