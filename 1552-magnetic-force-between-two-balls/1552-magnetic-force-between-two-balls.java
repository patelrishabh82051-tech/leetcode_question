class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int lo=0;
        int n=arr.length;
        int hi=arr[n-1]-arr[0];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(ispos(arr,m,mid)){
                ans=mid;
                lo=mid+1;
                
            }else{
                hi=mid-1;
            }

        }
        return ans;
        
    }
    static boolean ispos(int[] arr , int noc , int mid){
        int cow=1;
        int pos=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]-pos>=mid){
                cow++;
                pos=arr[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}