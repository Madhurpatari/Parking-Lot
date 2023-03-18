package Parking_Lot;

public abstract class Vehicle {
    private String ownerName;
    private String numberPlate;
    int parkingPrice = 10;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Vehicle(String ownerName, String numberPlate) {
        this.ownerName = ownerName;
        this.numberPlate = numberPlate;
    }

    public Vehicle(){};
}
