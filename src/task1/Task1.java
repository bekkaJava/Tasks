package task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;


    }

}
