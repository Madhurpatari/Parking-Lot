package Parking_Lot;

public class Slot {
    String slotNumber;
    Vehicle vehicle;

    public Slot(String slotNumber) {
        this.slotNumber = slotNumber;
        
    }
    public Ticket park(Vehicle vehicle){
        this.vehicle= vehicle;
        return new Ticket(vehicle, this);
    }
    public void notParked(){
        this.vehicle = null;
    }
}
