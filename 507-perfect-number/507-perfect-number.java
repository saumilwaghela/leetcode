class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int sum=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(i*i!=num && i!=1){
                    sum+= num/i;
                }
            }
        }
        //System.out.println(sum);
        return num==sum;
    }
}