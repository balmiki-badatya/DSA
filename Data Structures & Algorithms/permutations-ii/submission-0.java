class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> permutation = new ArrayList<>();
        List<List<Integer>> permutations = new ArrayList<>();
        Arrays.sort(nums);
        getPermutations(nums, permutation, permutations, new boolean[nums.length]);
        return permutations;
    }

    private void getPermutations(int[] nums, List<Integer> permutation,
        List<List<Integer>> permutations, boolean[] visited) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }

            visited[i] = true;
            permutation.add(nums[i]);

            getPermutations(nums, permutation, permutations, visited);

            visited[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}