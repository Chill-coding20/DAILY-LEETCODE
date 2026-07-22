class Solution {
    public String reverseWords(String s) {
        StringBuilder sentence = new StringBuilder();
        String word[] = s.trim().split("\\s+");

        for(int i=word.length-1;i>=0;i--){
            sentence.append(word[i]);
            if(i>0){
                sentence.append(" ");
            }
        }
        
        return sentence.toString();
    }
    
}