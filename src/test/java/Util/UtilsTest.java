package Util;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void atArea() {
        boolean res = Utils.atArea(1, 2, 3);
        Assert.assertTrue(res);
    }
}