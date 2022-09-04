class Solution {
    public boolean judgeCircle(String moves) {
        int currentPosition[] = {0,0};
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            switch(ch){
                case 'U': currentPosition[0]=currentPosition[0]+1;
                            break;
                case 'D': currentPosition[0]=currentPosition[0]-1;
                            break;
                case 'L': currentPosition[1]=currentPosition[1]-1;
                            break;
                case 'R': currentPosition[1]=currentPosition[1]+1;
                            break;      
            }
        }
        return currentPosition[0]==0 && currentPosition[1]==0;
    }
}