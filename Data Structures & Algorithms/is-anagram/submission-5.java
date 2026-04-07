class Solution {
    public boolean isAnagram(String s, String t) {
     var countS = new HashMap<Character, Integer>();
     if(s.length()!= t.length()){
        return false;
     }
     for(int i = 0; i < s.length(); i++){
        countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0)+1);
     }
     for(int j = 0; j < t.length(); j++){
        if(!countS.containsKey(t.charAt(j))){
            return false;
        }
        countS.put(t.charAt(j), countS.getOrDefault(t.charAt(j),0)-1);
      if(countS.get(t.charAt(j))==0){
countS.remove(t.charAt(j));
     }
     }
    
     return countS.isEmpty();
    }
}
