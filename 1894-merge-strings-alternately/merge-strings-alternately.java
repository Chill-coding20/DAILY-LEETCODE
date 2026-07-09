class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(),i=0,l2 = word2.length();
        StringBuilder s = new StringBuilder();
        while(i<l1 || i<l2){
            if(i<l1){
                s.append(word1.charAt(i));
            }
            if(i<l2){
                s.append(word2.charAt(i));
            }
            i++;
        }
        
        return s.toString();
    }
}