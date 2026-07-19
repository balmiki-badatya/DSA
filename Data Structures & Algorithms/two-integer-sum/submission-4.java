class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (numberMap.containsKey(target - nums[i])) {
                int[] arr = new int[]{i, numberMap.get(target - nums[i])};
                Arrays.sort(arr);
                return arr;
            }
            numberMap.put(nums[i], i);
        }
        return new int[0];
    }
}
