// leetcode problem number : 33
// search in rotated sorted array

/* testcases :
    Input: nums = [4,5,6,7,0,1,2], target = 0 -->Output: 4
    Input: nums = [4,5,6,7,0,1,2], target = 3 -->Output: -1
    Input: nums = [1], target = 0 --> Output: -1 */

// code :

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.search(new int[]{4,5,6,7,0,1,2},0));
        System.out.println(Solution.search(new int[]{4,5,6,7,0,1,2},3));
        System.out.println(Solution.search(new int[]{1},0));
    }
}
class Solution {
    public static int search(int[] nums, int target) {
        int breakPoint = -1;

        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                breakPoint = i;
                break;
            }
        }

        if(breakPoint == -1)
        {
            breakPoint = nums.length -1 ;
        }

        int l1 = 0;
        int h1 = breakPoint ;

        while(l1 <= h1)
        {
            int mid = l1 + (h1 - l1)/2;

            if(nums[mid] == target)
            {
                return mid;
            }else if(nums[mid] <= target)
            {
                l1 = mid +1;
            }else{
                h1 = mid -1;
            }
        }
        int l2 = breakPoint +1;
        int h2 = nums.length -1;

        while(l2<=h2)
        {
            int mid = l2 + (h2-l2)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] <= target)
            {
                l2 = mid+1;
            }
            else
            {
                h2 = mid -1;
            }
        }
        return -1;
    }
}