package IPhone;

import IPhone.IPhone14.IPhone14;
import IPhone.IPhone14.IPhone14Max;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIPhone14Max {
    @Test
    public void testIphone14CloneHavingSimilarValues() {
        IPhone14Max iPhone14Max = new IPhone14Max(12345,"DEFAULT",2,1,6,true);
        IPhone14Max iPhone14MaxCloned = iPhone14Max.clone();
        Assertions.assertEquals(iPhone14Max.getSerialNumber(),iPhone14MaxCloned.getSerialNumber());
        Assertions.assertEquals(iPhone14Max.getColor(),iPhone14MaxCloned.getColor());
        Assertions.assertEquals(iPhone14Max.getRam(),iPhone14MaxCloned.getRam());
        Assertions.assertEquals(iPhone14Max.getCamera(),iPhone14MaxCloned.getCamera());
        Assertions.assertEquals(iPhone14Max.getSpace(),iPhone14MaxCloned.getSpace());
    }

    @Test
    public void testIphone14CloneObjectsAreDifferentLocation() {
        IPhone14Max iPhone14Max = new IPhone14Max(12345,"DEFAULT",2,1,6,true);
        IPhone14Max iPhone14MaxCloned = iPhone14Max.clone();
        Assertions.assertNotEquals(iPhone14Max,iPhone14MaxCloned);
    }
}
