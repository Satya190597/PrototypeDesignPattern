package IPhone;

import IPhone.IPhone14.IPhone14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIPhone14 {
    @Test
    public void testIphone14CloneHavingSimilarValues() {
        IPhone14 iPhone14 = new IPhone14(12345, "DEFAULT", 2, 1, 6);
        IPhone14 iPhone14Black = iPhone14.clone();
        Assertions.assertEquals(iPhone14.getSerialNumber(), iPhone14Black.getSerialNumber());
        Assertions.assertEquals(iPhone14.getColor(), iPhone14Black.getColor());
        Assertions.assertEquals(iPhone14.getRam(), iPhone14Black.getRam());
        Assertions.assertEquals(iPhone14.getCamera(), iPhone14Black.getCamera());
        Assertions.assertEquals(iPhone14.getSpace(), iPhone14Black.getSpace());
    }

    @Test
    public void testIphone14CloneObjectsAreDifferentLocation() {
        IPhone14 iPhone14 = new IPhone14(12345, "DEFAULT", 2, 1, 6);
        IPhone14 iPhone14Black = iPhone14.clone();
        Assertions.assertNotEquals(iPhone14, iPhone14Black);
    }
}
