class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> subsetList = new ArrayList<>();

        Arrays.sort(nums);
        generateSubSet(nums, subset, subsetList, 0);
        System.out.println(subsetList);

        return subsetList;
    }

    private void generateSubSet(
        int[] nums, List<Integer> subset, List<List<Integer>> subsetList, int index) {
        // Base case

       
            subsetList.add(new ArrayList<>(subset));
       
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            subset.add(nums[i]);
            generateSubSet(nums, subset, subsetList, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
