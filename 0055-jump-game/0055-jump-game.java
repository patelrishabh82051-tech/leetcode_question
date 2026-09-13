class Solution {
    public boolean canJump(int[] nums) {
        int rec=0;
        for(int i=0 ; i<nums.length ; i++){
            if(rec<i){
                return false ;
            }
            else{
                 rec=Math.max(rec,i+nums[i]);
            }
        }
        return true;
    }
}