package Arrays;

import java.util.ArrayList;

public class Maximum69Number1323 {
    public static void main(String[] args) {
        int num = 6696;
        System.out.println(maximum69Number2(num));
    }

    // Method 1 without using in built function
    public static int maximum69Number (int num) {
        int ans =0;
        int[] arr = new int[100];
        int k =0;
        while(num>0)
        {
            int r = num%10;
            arr[k++] = r;
            num/=10;
        }
        for(int i =k-1;i>=0;i--)
        {
            if(arr[i] == 6)
            {
                arr[i] = 9;
                break;
            }
        }
        for(int i=k-1;i>=0;i--)
        {
            ans = (ans*10) + arr[i];
        }
        return ans;
    }


    // Method 2 using in built function

    public static int maximum69Number2 (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(arr));
    }

}
