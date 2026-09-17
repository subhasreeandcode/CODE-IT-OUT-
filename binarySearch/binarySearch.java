// leetcode problem number 704
//  binary search 
/* testcases : 
    [-1,0,3,5,9,12] , target = 9 --> output : 4
    [-1,0,3,5,9,12], target = 2 --> output : -1 */

class main 
{
    public static void main(String[]args)
    {
        System.out.println(Solution.binarySearch(new int[]{-1,0,3,5,9,12}, 9));
         System.out.println(Solution.binarySearch(new int[]{-1,0,3,5,9,12}, 2));
    }
}

class Solution
{
    public static int binarySearch(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length -1;

        while(low <= high)
        {
            int mid = (low + high)/2;

            if(nums[mid] == target)
            {
                return mid;
            }else if(nums[mid] > target)
            {
                high = mid-1;
            }
            else 
            {
                low = mid +1;
            }
        }
        return -1;
    }
}