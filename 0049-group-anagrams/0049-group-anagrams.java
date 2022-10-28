class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();
        for(String str: strs){
            char temp[] = str.toCharArray();
            Arrays.sort(temp);
            // StringBuffer strBuf = new StringBuffer();
            // for( char c : temp){
            //     strBuf.append(Character.toString(c));
            // }
            String finalString = new String(temp);
            if(anagramMap.containsKey(finalString)){
                List<String> currentList = anagramMap.get(finalString);
                currentList.add(str);
                anagramMap.put(finalString,currentList);
            }else{
                List<String> currentList = new ArrayList<String>(); 
                currentList.add(str);
                anagramMap.put(finalString, currentList);
            }
        }
        List<List<String>> solution = new ArrayList<List<String>>();
        for(List<String> list : anagramMap.values()){
            solution.add(list);
        }
        return solution;
    }
}