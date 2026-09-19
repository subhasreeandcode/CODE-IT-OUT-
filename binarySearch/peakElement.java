// leetcode problem number : 161
// peak element
/* testcases : 
    nums = [1,2,3,1]--> output : 2
    nums = [1,2,1,3,5,6,4] --> output : 5 */

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.findPeakElement(new int[]{1,2,3,1}));
        System.out.println(Solution.findPeakElement(new int[]{1,2,1,3,5,6,4}));

    }
}

class Solution
{
    public static int findPeakElement(int[] nums)
    {
        int low = 0;
        int high = nums.length-1;

        while(low < high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid] > nums[mid+1])
            {
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}