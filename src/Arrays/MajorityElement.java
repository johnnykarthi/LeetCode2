package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,1,2};
        System.out.println(majorityElement3(arr));
    }

    //Method 1

    public static int majorityElement(int[] arr) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            count =0;
            if(!map.containsKey(arr[i]))
            {
                for(int j =i; j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                        count++;
                }
                map.put(arr[i],count);
            }
        }
        AtomicInteger max = new AtomicInteger();
        AtomicInteger val = new AtomicInteger();
        map.forEach((key, value) -> {
            if(value > val.get())
            {
                val.set(value);
                max.set(key);
            }
        });
        int res = max.intValue();
        return res;
    }

    // Method 2

    public static int majorityElement2(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n/2];
    }

    // Method 3

    public static int majorityElement3(int[] arr) {
        int count = 0;
        int ans = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(count == 0)
                ans = arr[i];

            if(ans == arr[i])
                count++;
            else
                count--;
        }
        return ans;
    }

}
