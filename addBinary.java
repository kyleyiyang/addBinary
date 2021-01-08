class Solution {
    public String addBinary(String a, String b) {
        int n_a = a.length()-1;
        int n_b = b.length()-1;
        int l=0;
        StringBuilder ans = new StringBuilder();
        while (n_a>=0 || n_b>=0) {
            int p1 = n_a>=0?a.charAt(n_a)-'0':0;
            int p2 = n_b>=0?b.charAt(n_b)-'0':0;
            ans.append((p1+p2+l)%2);
            l = (p1+p2+l)/2;
            n_a--;
            n_b--;
        }
        if (l==1) ans.append(l);
        return ans.reverse().toString();
    }
}
