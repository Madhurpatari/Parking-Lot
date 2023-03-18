package Parking_Lot;

public class Truck extends Vehicle{
    int parkingPrice = 40;
    public Truck(String numberPlate, String ownerName){
        super(numberPlate, ownerName);
        super.parkingPrice = 40;
    }
}
