

public class Solution {
    public static int numPairsDivisibleBy60(int[] time) {
        int arr[] = new int[60];
        int ans = 0;
        for(int i=0;i<time.length;i++){
            arr[time[i]%60]++; // calculating the freq

        }
        for(int i=0;i<=30;i++){
            if(i==0 || i==30){
                int n = arr[i];
                ans += (n*(n-1))/2;
            }
            else{
                ans += arr[i]*arr[60-i];           // counting pairs
            }
        }
        return ans;
    }
}