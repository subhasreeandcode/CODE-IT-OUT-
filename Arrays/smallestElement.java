// given an array find the smallest element

/* testcase :
    {10, 25, 7, 89, 45, 32} --> output : 7 */

class main
{
    public static void main(String[]args)
    {
        System.out.println("smallest numbr : "+ Solution.smallestElement(new int[]{10,25,7,89,45,32}));
    }
}

class Solution
{
    public static int smallestElement(int[] nums)
    {
        int smallest = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(num < smallest)
            {
                smallest = num;
            }
        }
        return smallest;
    }
}