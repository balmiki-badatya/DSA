class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();

        generatePermutations(nums, permutationList, perm);
        return permutationList;
    }

    private void generatePermutations(
        int[] nums, List<List<Integer>> permutationList, List<Integer> perm) {
        // Base condition
        if (perm.size() == nums.length) {
            permutationList.add(new ArrayList(perm));
            return;
        }

        // add to the list
        for (int num : nums) {
            if (perm.contains(num)) {
                continue;
            }
            perm.add(num);
            generatePermutations(nums, permutationList, perm);
            perm.remove(perm.size() - 1);
        }
    }
}
