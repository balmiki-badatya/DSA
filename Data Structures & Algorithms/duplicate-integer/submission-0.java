class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbersSet = new HashSet<>();
        for(int num : nums) {
            if(numbersSet.contains(num)) {
                return true;
            }
            numbersSet.add(num);
        }
        return false;
        
    }
}