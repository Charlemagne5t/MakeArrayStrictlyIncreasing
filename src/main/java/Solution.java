import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int n = arr1.length;
        TreeSet<Integer> sortedArr2 = new TreeSet<>();
        for (int num : arr2) {
            sortedArr2.add(num);
        }
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(-1, 0);

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> temp = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : dp.entrySet()) {
                int num = entry.getKey();
                int cost = entry.getValue();

                if (arr1[i] > num) {
                    temp.put(arr1[i], Math.min(temp.getOrDefault(arr1[i], Integer.MAX_VALUE), cost));
                }

                Integer higherNum = sortedArr2.higher(num);
                if (higherNum != null) {
                    temp.put(higherNum, Math.min(temp.getOrDefault(higherNum, Integer.MAX_VALUE), cost + 1));
                }
            }
            dp = temp;

            if (dp.isEmpty()) {
                return -1;
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int cost : dp.values()) {
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}
