class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[]a=new int[201];
        int sum=0;
        int max=0;
        for(int n:nums){
            max=Math.max(max,Math.abs(n));
            a[100+n]++;
            sum+=n;
        }
        if(max==0){
            return 0;
        }
        while(k--!=0){
            int i=100-max;
            while(a[i]==0){
                i++;
            }
            a[i]--;
            a[200-i]++;
            sum-=2*(i-100);
        }
        return sum;
    }
}