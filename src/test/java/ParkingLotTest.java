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
}
