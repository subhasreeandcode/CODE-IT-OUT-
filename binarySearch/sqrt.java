// leetcode problem number 69
// sqrt(x)

/* testcase:
    x = 4 --> output : 2
    x = 8 --> output : 2 */

class main
{
    public static void main(String[]rgs)
    {
        System.out.println(Solution.mySqrt(4));
        System.out.println(Solution.mySqrt(8));
    }
}

class Solution
{""
    public static int mySqrt(int x)
    {
        if(x < 2)
            return x;
        
        int low = 1;
        int high = x/2;
        int sqrt = 0;

        while(low <= high){
            {
                int mid = low + (high - low)/2;

                if(mid <= x/mid)
                {
                    sqrt = mid;
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return sqrt;
    }
}