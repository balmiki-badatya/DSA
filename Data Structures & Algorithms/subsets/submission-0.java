class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> subsetList = new ArrayList<>();
        generateSubSets(nums, 0, subset, subsetList);
        return subsetList;
    }

    private void generateSubSets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsetList) {
        if (index == nums.length) {
            subsetList.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[index]);
        generateSubSets(nums, index + 1, subset, subsetList);
        subset.remove(subset.size() - 1);
        generateSubSets(nums, index + 1, subset, subsetList);
    }
}
