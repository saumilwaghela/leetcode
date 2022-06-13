class Solution {
    public int binarySearch(int start, int end, int array[],int value){
        int mid = (start+end)/2;
        if(start<=end){
            if(array[mid]==value)
                return mid;
            else if(array[mid]>value)
                return binarySearch(start,mid-1,array,value);
            else return binarySearch(mid+1,end,array,value);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(0,nums.length-1,nums,target);
    }
}