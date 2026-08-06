class Solution {
    public int[] plusOne(int[] nums) {
        int x=nums.length;

        for(int i=x-1 ; i>=0 ; i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            
                nums[i]=0;
            
        }
        int[] neww=new int[x+1];
        neww[0]=1;
        return neww;
        
    }
}