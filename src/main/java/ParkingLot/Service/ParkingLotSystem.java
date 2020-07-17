package ParkingLot.Service;

public class ParkingLotSystem {
    public int numberOfCarsParked;

    public ParkingLotSystem(int numberOfCarsParked) {
        this.numberOfCarsParked = numberOfCarsParked;
    }

    public boolean parkingStatus() {
        if (numberOfCarsParked < 100) return true;
        return false;
    }
}
