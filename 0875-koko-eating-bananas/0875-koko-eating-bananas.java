class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sumba=0;
        int hi=0;
        for (int p : piles) hi = Math.max(hi, p);
        int lo=1;
       
        int ans=0;
        Arrays.sort(piles);
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(isPos(piles , h , mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isPos(int[] piles, int h, int k) {
        long tt=0;
        for(long i : piles){
            tt+=(i+k-1)/k;
        }
        return tt<=h;
    
}
}