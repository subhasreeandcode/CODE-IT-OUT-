// leetcode problem number 42
// trapping the rain water

/* testcases :
    height = [0,1,0,2,1,0,1,3,2,1,2,1] -->output : 6
    height = [4,2,0,3,2,5] --> output: 9 */

class Solution 
{
    public static int trap(int[] heights)
    {
        int left = 0;
        int right = heights.length -1;

        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while(left < right)
        {
            if(heights[left] <= heights[right])
            {
                if(heights[left] >= leftmax)
                {
                    leftmax = heights[left];
                }else
                {
                    water += leftmax - heights[left];
            }
                left ++;
            }
            else{

                if(heights[right] >= rightmax)
                {
                    rightmax = heights[right];
                }else
                {
                    water +=rightmax- heights[right];
                }
                right--;
            }
        }
        return water;
    }
}

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(Solution.trap(new int[]{4,2,0,3,2,5}));

    }
}
 