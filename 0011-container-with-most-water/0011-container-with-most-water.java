class Solution {
    public int maxArea(int[] height) {
        int l=0 ;
        int r=height.length-1;
        int curr;
        int maxx=0;
        while(l<r){
            curr=Math.min(height[r],height[l]);
            int diff=r-l;
            int area=curr*diff;
            maxx=Math.max(area,maxx);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxx;

    }
}