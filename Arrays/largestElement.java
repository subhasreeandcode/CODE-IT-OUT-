// Give an array [10, 25, 7, 89, 45, 32]. Find the largest element of that array

/* testcase:
    {10, 25, 7, 89, 45, 32} --> output : 89 */

class main
{
    public static void main(String[]args){
        System.out.println("largest element : " + Solution.largestElement(new int[] {10, 25, 7, 89, 45, 32}));
    }
}

class Solution
{
    public static int largestElement(int[] nums)
    {
        int largest = Integer.MIN_VALUE;
        for(int number : nums)
        {
            if(number > largest)
            {
                largest = number;
            }
        }
        return largest;
    }
}