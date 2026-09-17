// leetcode problem number 35
// search insert position

/* testcases : 
    nums = [1,3,5,6] , target = 5 --> output : 2
    nums = [1,3,5,6], target = 2 --> output : 1
    nums = [1,3,5,6], target = 7 --> output : 4 */

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
class Solution
{
    public static int searchInsert(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length -1 ;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] <= target)
            {
                low = mid + 1;

            }else{
                high = mid -1;
            }
        }
        return low;
    }

}