package martinez.company;

public class SuiteRoom extends Room {

    // Instance Fields || Variables
    private int rooms;
    private int beds;
    private boolean kitchenette;
    private boolean needsRestock;

    // Constructor
    public SuiteRoom(int roomNumber, String roomType, int floor, float averagePrice, int rooms,
                     int beds, boolean kitchenette) {
        super(roomNumber, type, floor, averagePrice);
        this.rooms = rooms;
        this.beds = beds;

        this.kitchenette = kitchenette;
        this.needsRestock = false;
    }

    // reStock method
    public void reStock() {
        if (!needsRestock)
            this.needsRestock = true;
    }

    // reserveRoom override check kitchen and need restocking
    @Override
    public boolean reserveRoom(Client occupant) {
        if(this.kitchenette && this.needsRestock) {
            System.out.println("Can't book, room needs restock");
            return false;
        }
        return super.reserveRoom(occupant);
    }

    // checkoutRoom override
    @Override
    public void checkoutRoom(Client occupant) {
        if(this.kitchenette) {
            this.needsRestock = true;
        }
        super.checkoutRoom(occupant);
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
