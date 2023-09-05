package Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,5,7};
        int ans =0;
        for(int i =0;i<arr.length;i++)
        {
            ans = ans^arr[i];
        }

        System.out.println(ans);

    }
}
