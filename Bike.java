package Parking_Lot;

public class Bike extends Vehicle{
    int parkingPrice = 10;
    public Bike(String numberPlate, String ownerName){
        super(numberPlate, ownerName);
        super.parkingPrice = 10;
    }
}
