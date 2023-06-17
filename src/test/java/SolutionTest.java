import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void makeArrayIncreasingTest1() {
        int[] arr1 = {1, 5, 3, 6, 7};
        int[] arr2 = {4, 3, 1};
        int output = 2;
        Assert.assertEquals(output, new Solution().makeArrayIncreasing(arr1, arr2));
    }

    @Test
    public void makeArrayIncreasingTest2() {
        int[] arr1 = {1, 5, 3, 6, 7};
        int[] arr2 = {4, 3, 1};
        int output = 2;
        Assert.assertEquals(output, new Solution().makeArrayIncreasing(arr1, arr2));
    }

    @Test
    public void makeArrayIncreasingTest3() {
        int[] arr1 = {1, 5, 3, 6, 7};
        int[] arr2 = {1, 6, 3, 3};
        int output = -1;
        Assert.assertEquals(output, new Solution().makeArrayIncreasing(arr1, arr2));
    }
}
