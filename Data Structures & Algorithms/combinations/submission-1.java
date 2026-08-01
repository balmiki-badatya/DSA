class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(n, k, 1, combination, combinations);
        return combinations;
    }

    private void generateCombinations(
        int n, int k, int index, List<Integer> combination, List<List<Integer>> combinations) {
        if (combination.size() == k) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        for (int i = index; i <= n; i++) {
            combination.add(i);
            generateCombinations(n, k, i+ 1, combination, combinations);
            combination.remove(combination.size() - 1);
        }
    }
}