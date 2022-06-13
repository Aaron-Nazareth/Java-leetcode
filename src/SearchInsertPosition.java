/* Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
*/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        System.out.println(searchInsert(input, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { // Loop through integer array
            if(nums[i] == target) {
//                System.out.println("i is :" + i);
                return i;   // Return the position if we find that our target exists in the array
            }
            if (target<nums[i]) {
                return i;   // Return position if our target doesn't exist in the array but has a value less than the current
                // iteration, since that would be the position it takes when added to the array
            }
        }
        return nums.length; // If target number isn't already in the array and is larger in value than all other entries, then it
        // would be placed after the final position - which is nums.length
    }
}
