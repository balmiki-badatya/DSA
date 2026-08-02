class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombination(candidates, target, 0, 0, combination, combinations);
        return combinations;
    }

    private void generateCombination(int[] candidates, int target, int currentIndex, int sum,
        List<Integer> combination, List<List<Integer>> combinations) {
        if (target == sum) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        for (int index = currentIndex; index < candidates.length; index++) {
            if (index > currentIndex && candidates[index] == candidates[index - 1]) {
                continue;
            }

            if (sum + candidates[index] > target) {
                break;
            }

            combination.add(candidates[index]);
            generateCombination(
                candidates, target, index + 1, (sum + candidates[index]), combination, combinations);
            combination.remove(combination.size() - 1);
        }
    }
}
