class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> anagram = null;
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            String hash = getHashKey(str);
            System.out.println(str + " : " + hash);
            anagram = anagramMap.getOrDefault(hash, new ArrayList<>());

            anagram.add(str);
            anagramMap.put(hash, anagram);
        }

        return new ArrayList<>(anagramMap.values());
    }

    private String getHashKey(String s) {
        int[] chars = new int[26];
        StringBuilder hash = new StringBuilder();

        for (char ch : s.toCharArray()) {
            chars[ch - 'a'] += 1;
        }

        for (int index = 0; index < chars.length; index++) {
            if (chars[index] != 0) {
                hash.append(index).append(chars[index]).append("#");
            }
        }
        return hash.toString();
    }
}
