class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Ensure str1 is always the longer or equal string
        if (str2.length() > str1.length()) return gcdOfStrings(str2, str1);
        
        // Base case: strings match perfectly
        if (str2.equals(str1)) return str1;
        
        // If the longer string starts with the shorter one, chop off the prefix
        if (str1.startsWith(str2)) {
            // FIX: Pass str2 as the second argument, not str1
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        
        // If there's no matching prefix match, a common divisor string cannot exist
        return "";
    }
}
