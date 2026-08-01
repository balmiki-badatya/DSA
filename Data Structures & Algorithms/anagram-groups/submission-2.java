class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> anagram = null;
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> anagramGroup = new ArrayList<>();

        for (String str : strs) {
            String hash = getHashKey(str);
            System.out.println(str + " : " + hash);
            anagram = anagramMap.getOrDefault(hash, new ArrayList<>());

            anagram.add(str);
            anagramMap.put(hash, anagram);
        }

        for (List<String> anagrams : anagramMap.values()) {
            anagramGroup.add(anagrams);
        }

        return anagramGroup;
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
