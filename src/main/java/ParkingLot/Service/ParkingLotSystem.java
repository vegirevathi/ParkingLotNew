package ParkingLot.Service;

import ParkingLot.Model.Customer;

public class ParkingLotSystem {
    public int numberOfCarsParked;
    public int parkingLotNumber;

    public boolean parkingStatus(int numberOfCarsParked) {
        this.numberOfCarsParked = numberOfCarsParked;
        if (numberOfCarsParked < 100) return true;
        return false;
    }

    public int customerInvoice(int parkingLotNumber) {
        return parkingLotNumber;
    }

    public boolean unParkingStatus(int a, int b) {
        if (a == b) return true;
        return false;
    }
}
