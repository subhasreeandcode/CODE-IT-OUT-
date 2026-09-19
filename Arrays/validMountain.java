// leetcode problem number : 941
// valid mountain

/* testcases : 
    arr = [2,1] --> output : false
    arr = [3,5,5] --> output : false
    arr = [0,3,2,1] --> output : true */

class main
{
    public static void main(String[]args){
    System.out.println(Solution.validMountainArray(new int[]{2,1}));
    System.out.println(Solution.validMountainArray(new int[]{3,5,5}));
    System.out.println(Solution.validMountainArray(new int[]{0,3,2,1}));
    }
}

class Solution
{
    public static boolean validMountainArray(int[] arr)
    {
        int n = arr.length;
        int i = 0;

        while(i!= n-1 && arr[i]<arr[i+1])
        {
            i++;
        }
        if(i==n-1 || i==0)
        {
            return false;
        }
        while(i!=n-1 && arr[i]>arr[i+1])
        {
            i++;
        }
        if(i==n-1)
        {
            return true;
        }
        return false;
    }
}