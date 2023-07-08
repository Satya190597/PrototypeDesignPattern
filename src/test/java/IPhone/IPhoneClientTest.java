package IPhone;

import Client.IPhoneClient;
import IPhone.IPhone14.IPhone14;
import IPhone.IPhone14.IPhone14Max;
import IPhone.IPhone15.IPhone15;
import IPhone.IPhone15.IPhone15Max;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IPhoneClientTest {
    IPhoneClient client = null;

    @BeforeEach
    public void init() {
        client = new IPhoneClient();
    }

    /**
     * This is a test case that verifies the creation of a black IPhone14 object using
     * the getBlackIPhone14() method in the client.
     */
    @Test
    public void testGetBlackIPhone14() {
        IPhone14 iPhone14Black = client.getBlackIPhone14();
        Assertions.assertEquals(299, iPhone14Black.getSerialNumber());
        Assertions.assertEquals("BLACK", iPhone14Black.getColor());
        Assertions.assertEquals(2, iPhone14Black.getRam());
        Assertions.assertEquals(1, iPhone14Black.getCamera());
        Assertions.assertEquals(6, iPhone14Black.getSpace());
    }

    /**
     * This is a test case that verifies the creation of a black IPhone14 Max object using
     * the getBlackIPhone14Max() method in the client.
     */
    @Test
    public void testGetBlackIPhone14Max() {
        IPhone14Max iPhone14MaxBlack = client.getBlackIPhone14Max();
        Assertions.assertEquals(399, iPhone14MaxBlack.getSerialNumber());
        Assertions.assertEquals("BLACK", iPhone14MaxBlack.getColor());
        Assertions.assertEquals(2, iPhone14MaxBlack.getRam());
        Assertions.assertEquals(1, iPhone14MaxBlack.getCamera());
        Assertions.assertEquals(6, iPhone14MaxBlack.getSpace());
        Assertions.assertTrue(iPhone14MaxBlack.isWirelessCharging());

    }

    /**
     * This is a test case that verifies the creation of a black IPhone15 object using
     * the getBlackIPhone15() method in the client.
     */
    @Test
    public void testGetBlackIPhone15() {
        IPhone15 iPhone15Black = client.getBlackIPhone15();
        Assertions.assertEquals(499, iPhone15Black.getSerialNumber());
        Assertions.assertEquals("BLACK", iPhone15Black.getColor());
        Assertions.assertEquals(2, iPhone15Black.getRam());
        Assertions.assertEquals(1, iPhone15Black.getCamera());
        Assertions.assertEquals(6, iPhone15Black.getSpace());
        Assertions.assertTrue(iPhone15Black.isWirelessCharging());
    }

    /**
     * This is a test case that verifies the creation of a black IPhone15 Max object using
     * the getBlackIPhone15Max() method in the client.
     */
    @Test
    public void testGetBlackIPhone15Max() {
        IPhone15Max iPhone15BlackMax = client.getBlackIPhone15Max();
        Assertions.assertEquals(599, iPhone15BlackMax.getSerialNumber());
        Assertions.assertEquals("BLACK", iPhone15BlackMax.getColor());
        Assertions.assertEquals(2, iPhone15BlackMax.getRam());
        Assertions.assertEquals(1, iPhone15BlackMax.getCamera());
        Assertions.assertEquals(6, iPhone15BlackMax.getSpace());
        Assertions.assertTrue(iPhone15BlackMax.isWirelessCharging());
        Assertions.assertTrue(iPhone15BlackMax.isSupport4k());
    }
}
