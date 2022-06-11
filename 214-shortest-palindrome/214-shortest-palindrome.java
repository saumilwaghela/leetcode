class Solution {
    public String shortestPalindrome(String s) {
         if(s == null || s.length() == 0) return s;
        
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        
        for(int i = 0; i < rs.length(); i++)
            if(s.startsWith(rs.substring(i)))
                return rs.substring(0, i) + s;
        
        return rs.append(s).toString();
    }
}