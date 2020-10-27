package martinez.company;

public class Client {

    private String clientName;
    private int partySize;
    private float currentBill;
    private float prepaidBill;
    private String phoneNumber;

    // Constructor
    public Client(String clientName, int partySize, float currentBill, float prepaidBill, String phoneNumber) {
        this.clientName = clientName;
        this.partySize = partySize;
        this.currentBill = currentBill;
        this.prepaidBill = prepaidBill;
        this.phoneNumber = phoneNumber;

        // Balance after prepaid
        this.currentBill -= prepaidBill;
    }

    // Methods

    // Payment made
    public void makePayment (float balancePaid){
        this.prepaidBill += balancePaid;
    }

    // Charge added to room
    public void chargeRoom (float balanceAdd){
        this.currentBill += balanceAdd;
    }

    // Get remaining bill
    public float getOutstanding () {
        System.out.println("Current Bill: " + this.currentBill);
        return this.currentBill;
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
