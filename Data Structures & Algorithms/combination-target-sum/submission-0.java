class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        generateCombinationWithSumK(nums, target, 0, combination, combinations, 0);

        return combinations;

    }

    private void generateCombinationWithSumK(int[] nums, int target, int currentSum,
        List<Integer> combination, List<List<Integer>> combinations, int currentIndex) {
        if (target == currentSum) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        if (currentSum > target) {
            return;
        }

        for (int index = currentIndex; index < nums.length; index++) {
            currentSum =  currentSum + nums[index];
            combination.add(nums[index]);

            generateCombinationWithSumK(
                nums, target, currentSum, combination, combinations, index);

            currentSum = currentSum - nums[index];
            combination.remove(combination.size() - 1);
        }
    }
}
