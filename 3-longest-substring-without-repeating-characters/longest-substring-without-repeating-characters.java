class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet <Character> ();
        int cur=0;
        int max = 0;
        int start=0;
        int i=0;
        for(i =0 ;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(start));
                start++;
            }
            cur=i-start+1;  
            max=Math.max(cur,max);
            hs.add(s.charAt(i));
        }
        return max;

    }
}