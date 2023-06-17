import java.util.Arrays;

public class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {

        Arrays.sort(arr2);
        return dfs(arr1, arr2, 1, 0);
    }
    private int dfs(int[] arr1, int[] arr2, int i, int j){
        if(i == arr1.length ){
            return -1;
        }
        int result = 0;
        if(arr1[i] < arr1[i -1])
    }
}