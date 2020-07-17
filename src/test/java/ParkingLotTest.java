import ParkingLot.Model.Customer;
import ParkingLot.Service.ParkingLotSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

    ParkingLotSystem parkingLotSystem;

    @Before
    public void setUp() throws Exception {
        parkingLotSystem = new ParkingLotSystem();
    }

    @Test
    public void givenParkingLotSystem_WhenParkingAvailable_ShouldReturnTrue() {
        //ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean parkingStatus = parkingLotSystem.parkingStatus(60);
        Assert.assertEquals(true, parkingStatus);
    }

    @Test
    public void givenParkingLotSystem_WhenParkingNotAvailable_ShouldReturnFalse() {
        //ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean parkingStatus = parkingLotSystem.parkingStatus(100);
        Assert.assertEquals(false, parkingStatus);
    }

    @Test
    public void givenParkingLotSystem_WhenCustomerTokenNumberEqualsParkingLotNumber_ShouldReturnTrue() {
        Customer customer = new Customer(123);
        int customerTokenNumber = customer.tokenNumber;
        int parkingLotNumber = parkingLotSystem.customerInvoice(123);
        boolean result = parkingLotSystem.unParkingStatus(customerTokenNumber, parkingLotNumber);
        Assert.assertEquals(true, result);
    }
}
