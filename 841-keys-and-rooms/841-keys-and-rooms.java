class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int count = 0;
        boolean foundKeyOfRoom[] = new boolean[n];
        boolean visitedRoom[] = new boolean[n];
        Queue<Integer> nextRoomsToBeChecked = new ArrayDeque<Integer>();
        
        nextRoomsToBeChecked.offer(0);
        foundKeyOfRoom[0] =true;
        
        while(!nextRoomsToBeChecked.isEmpty()){
            int currentRoom = nextRoomsToBeChecked.poll();
            visitedRoom[currentRoom] = true;
            count++;
            //System.out.println(currentRoom);
            for(int roomKey: rooms.get(currentRoom)){
               if(!visitedRoom[roomKey] && !foundKeyOfRoom[roomKey]) {
                   nextRoomsToBeChecked.offer(roomKey);
                   foundKeyOfRoom[roomKey] =true;
               };
            }
        }
        
        return count == n;
        
    }
}