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
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
//                System.out.println("i is :" + i);
                return i;
            }
            if (target<nums[i]) {

                return i;
            }
        }
        return  nums.length;
    }
}
