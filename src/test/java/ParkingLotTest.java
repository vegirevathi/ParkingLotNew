import ParkingLot.Service.ParkingLotSystem;
import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void givenParkingLotSystem_WhenParkingAvailable_ShouldReturnTrue() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(60);
        boolean parkingStatus = parkingLotSystem.parkingStatus();
        Assert.assertEquals(true, parkingStatus);
    }

    @Test
    public void givenParkingLotSystem_WhenParkingNotAvailable_ShouldReturnFalse() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem(100);
        boolean parkingStatus = parkingLotSystem.parkingStatus();
        Assert.assertEquals(false, parkingStatus);
    }
}
