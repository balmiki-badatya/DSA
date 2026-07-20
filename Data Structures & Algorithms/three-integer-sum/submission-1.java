class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j+1]) {
                            j = j + 1;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k = k - 1;
                    }

                    j++;
                    k--;
                } else if (sum > 0) {
                     k = k - 1;
                } else {
                    j = j + 1;
                }
            }
        }

        return resultList;
    }
}
