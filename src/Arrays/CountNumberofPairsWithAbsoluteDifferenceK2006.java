package Arrays;

public class CountNumberofPairsWithAbsoluteDifferenceK2006 {

    public static void main(String[] args) {
        int[] arr = {1,3};
        int k = 3;
        System.out.println(countKDifference(arr,k));
    }

    public static int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i =0;i<nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                int temp = nums[i] - nums[j];
                if(temp < 0)
                    temp = temp*-1;
                if(temp == k )
                    count++;
            }
        }
        return count;
    }
}
