package martinez.company;

public class Client extends Room {

    private String clientName;
    private int partySize;
    private float currentBill;
    private float prepaidBill;
    private String phoneNumber;

    // Constructor with super from Room
    public Client(int roomNumber, String type, int floor, float averagePrice, String clientName, int partySize, float currentBill, float prepaidBill, String phoneNumber) {
        super(roomNumber, type, floor, averagePrice);
        this.clientName = clientName;
        this.partySize = partySize;
        this.currentBill = currentBill;
        this.prepaidBill = prepaidBill;
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public float getCurrentBill() {
        return currentBill;
    }

    public void setCurrentBill(float currentBill) {
        this.currentBill = currentBill;
    }

    public float getPrepaidBill() {
        return prepaidBill;
    }

    public void setPrepaidBill(float prepaidBill) {
        this.prepaidBill = prepaidBill;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
