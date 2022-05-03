package Util;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void atArea() {
        boolean expected = true;
        boolean res = Utils.atArea(1, 2, 3);
        Assert.assertEquals(expected, res);
    }
}