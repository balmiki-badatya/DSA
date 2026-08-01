class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> anagram = null;
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<List<String>> anagramGroup = new ArrayList<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            anagram = anagramMap.getOrDefault(sortedString, new ArrayList<>());

            anagram.add(str);
            anagramMap.put(sortedString, anagram);
        }
        

        for(List<String> anagrams : anagramMap.values()){
            anagramGroup.add(anagrams);
        }
        
        return anagramGroup;
    }
}
