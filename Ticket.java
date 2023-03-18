package Parking_Lot;

import java.time.LocalTime;

public class Ticket {
    Vehicle vehicle;
    Slot slot;
    LocalTime entryTime;

    public Ticket(Vehicle vehicle, Slot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalTime.now();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.slot.slotNumber).append("--").append(this.vehicle.getNumberPlate()).append("--").append(entryTime);
        return sb.toString();
    }
}
