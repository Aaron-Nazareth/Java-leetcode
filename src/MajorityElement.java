import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

public class MajorityElement {
    public static void main(String[] args) {
        int[] input = {3,2,3};
        int[] input1 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(input));
        System.out.println(majorityElement(input1));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (! map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                int currentValue = map.get(nums[i]);
                map.put(nums[i], currentValue+1);
            }
        }
        int maxValue = (Collections.max((map.values())));
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                key = entry.getKey();
            }
        }
        return key;
    }
}
