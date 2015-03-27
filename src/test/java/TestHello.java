import org.junit.Test;
import org.junit.Assert;

public class TestHello {

    @Test
    public void testPasses() {
        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        Assert.assertEquals(hello, expected);
    }

    @Test
    public void testFails() {
        // The worlds most obvious bug:
        Assert.assertTrue(true);
    }

    @Test
    public void testArray() {
        int [] array1 = new int[] {1, 2, 3};
        int [] array2 = new int[] {1, 2, 3};
        Assert.assertArrayEquals(array1, array2);
    }
}