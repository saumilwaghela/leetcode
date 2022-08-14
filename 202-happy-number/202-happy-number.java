class Solution {
    Set<Integer> seenSet = new HashSet<Integer>();
    public boolean isHappy(int n) {
        System.out.println(n);
        int nextNumber =0;
        while(n!=0){
            nextNumber = nextNumber+ ((n%10)*(n%10));
            n=n/10;
        }
        if(seenSet.contains(nextNumber)){
            return false;
        }
        else{
            seenSet.add(nextNumber);
        }
        return nextNumber ==1?true:isHappy(nextNumber);
    }
}