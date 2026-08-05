class Solution {
    public int majorityElement(int[] nums) {
        int majorityCandidate = -1;
        int count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                majorityCandidate = num;
                count += 1;
            } else {
                if (num == majorityCandidate) {
                    count += 1;
                } else {
                    count -= 1;
                }
            }
        }
        return majorityCandidate;
    }
}