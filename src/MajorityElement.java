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
        HashMap<Integer, Integer> map = new HashMap<>();    // use of hashmap to create key:value pairs
        for (int i = 0; i < nums.length; i++) { // loop through array
            if (! map.containsKey(nums[i])) {
                map.put(nums[i],1); // if input doesn't exist in hashmap, then create a key for it and assign value of 1
            } else {
                int currentValue = map.get(nums[i]);    // create variable for the current value of an existing input's key
                map.put(nums[i], currentValue+1);   // update the entry, by adding 1 to the value of that key
            }
        }
        int maxValue = (Collections.max((map.values())));   // find max value across entries
        int key = 0;    // create placeholder variable to eventually store most occurring key
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Loop through hashmap entries
            if (entry.getValue() == maxValue) {
                key = entry.getKey();   // make key placeholder the most occurring key, based on highest value in the hashmap
            }
        }
        return key; // return most occurring key, aka the majority element
    }
}
