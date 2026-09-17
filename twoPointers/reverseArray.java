// write a java program to reverse the array

/* input : [10, 25, 7, 89, 45, 32]
   output : [32,45,89,7,25,10] */

import java.util.Arrays;

class main
{
    public static void main(String[] args)
    {
        System.out.println(
            "Reversed array : " +
            Arrays.toString(
                Solution.reverseArray(new int[]{10, 25, 7, 89, 45, 32})
            )
        );
    }
}

class Solution
{
    public static int[] reverseArray(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums;
    }
}