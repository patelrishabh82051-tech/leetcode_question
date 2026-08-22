class Solution {
    static void ne(int n,int l,int r,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) ne(n,l+1,r,s+"(",ans);
        if(r<l) ne(n,l,r+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        ne(n,0,0,"",ans);
        return ans;
        
    }
}