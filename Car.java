package Parking_Lot;

public class Car extends Vehicle{
    int parkingPrice = 20;
    public Car(String numberPlate, String ownerName){
        super(numberPlate, ownerName);
        super.parkingPrice = 20;
    }
}
