import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestBins {
    @Test
    public void binSizeTest() {
        Bins testBin = new Bins(18);
        Integer expected = 19;
        Integer actual = testBin.bin.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementAndGetOnceTest() {
        Bins testBin = new Bins(8);
        testBin.incrementBin(7);
        int actaul = testBin.getBin(7);
        Assert.assertEquals(1, actaul);
    }

    @Test
    public void incrementTwiceAndGetTest() {
        Bins testBin = new Bins(8);
        testBin.incrementBin(5);
        testBin.incrementBin(4);
        testBin.incrementBin(5);
        int actual = testBin.getBin(5);
        Assert.assertEquals(2, actual);
    }

    @Test
    public void incrementTwiceAndPrintTest() {
        Bins testBin = new Bins(8);
        testBin.incrementBin(5);
        testBin.incrementBin(4);
        testBin.incrementBin(5);
        System.out.println(Arrays.toString(testBin.bin));
    }
}
