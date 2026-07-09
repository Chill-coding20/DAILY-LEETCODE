class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(),i,l2 = word2.length();
        StringBuilder s = new StringBuilder();
        for(i=0;i<l1 && i<l2;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            System.out.println(word1+" "+word2);
        }
        if(i<l2) 
        {
            s.append(word2,i,l2);
        }
        else{
            s.append(word1,i,l1);
        }
        return s.toString();
    }
}