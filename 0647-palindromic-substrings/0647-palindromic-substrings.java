class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+1 ; j<=s.length() ; j++){
                String s1=s.substring(i,j);
                if(pal(s1)){
                    c++;
                }
            }
        }
            return c;
        
        
    }
    static boolean pal(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}