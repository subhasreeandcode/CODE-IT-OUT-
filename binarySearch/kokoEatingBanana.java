/* Koko Eating Bananas

LeetCode: 875  
Topic: Binary Search

Approach :
We use binary search to find the minimum eating speed.
The possible speed ranges from 1 to the maximum pile size.
For each speed, we calculate how many hours Koko would need to finish all the bananas.
If the required hours are less than or equal to `h`, we try a smaller speed.
Otherwise, we increase the speed.

Complexity:

Time: O(n log m)
Space: O(1)
Where:
    n = number of banana piles
    m = maximum pile size */

/* testcase:
    [3,6,7,11], h = 8 --> output : 4 
    [30,11,23,4,20], h = 5 --> output : 30
    [30,11,23,4,20], h = 6 --> output : 23 */

//code :

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.minEatingSpeed(new int[]{3,6,7,11}, 8)); 
        System.out.println(Solution.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
        System.out.println(Solution.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}

class Solution
{
    public static int minEatingSpeed(int[] piles, int h)
    {
        int minspeed = 1;
        int maxspeed = 0;

        for(int pile : piles){
            maxspeed = Math.max(pile, maxspeed);
        }

        while(minspeed < maxspeed)
        {
            int kokospeed = minspeed + (maxspeed - minspeed)/2;
            long hours=0 ; 

            for(int pile : piles)
            {
                hours+= (pile + kokospeed-1 ) / kokospeed;
            }

            if(hours <= h)
            {
                maxspeed = kokospeed;
            }
            else
            {
                minspeed = kokospeed+1;
            }
        }
        return minspeed;
    }
}