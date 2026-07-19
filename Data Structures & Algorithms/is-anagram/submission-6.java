class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMap1 = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for (char charecter : s.toCharArray()) {
            charMap1.put(charecter, charMap1.getOrDefault(charecter, 0) + 1);
        }

        for (char charecter : t.toCharArray()) {
            charMap2.put(charecter, charMap2.getOrDefault(charecter, 0) + 1);
        }
        
        return charMap1.equals(charMap2);
    }
}
