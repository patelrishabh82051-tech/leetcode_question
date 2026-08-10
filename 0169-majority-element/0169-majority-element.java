class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(var e : map.entrySet()){
            if(e.getValue()>l/2){
                return e.getKey();
            }
        }
        return -1;
    }
}