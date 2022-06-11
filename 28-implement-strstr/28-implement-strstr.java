class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null || needle.equals(""))
            return 0;
        else
            return haystack.indexOf(needle);
    }
}