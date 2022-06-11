class Solution {
    public int climbStairs(int n) {
        int n_minus_1 =1;
        int n_minus_2 =1;
        int temp =1;
        for(int i=2;i<=n;i++){
            temp = n_minus_1 + n_minus_2;
            n_minus_2 = n_minus_1;
            n_minus_1 = temp;
        }
        return temp;
    }

}