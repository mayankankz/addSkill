class Solution {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        char sum = t.charAt(len);
        
        for(int i = 0 ; i < len ; i++) 
            sum += t.charAt(i) - s.charAt(i);
        
        return sum;
    }
}
