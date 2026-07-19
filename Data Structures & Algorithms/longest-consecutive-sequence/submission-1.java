class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequenceSet = new HashSet<>();
        int maxSequenceCount = 0;
        for (int num : nums) {
            sequenceSet.add(num);
        }

        for (int num : nums) {
            int sequenceCount = 1;
            if (!sequenceSet.contains(num - 1)) {
                int number = num + 1;
                while (sequenceSet.contains(number)) {
                    sequenceCount += 1;
                    number += 1;
                }
            }
            maxSequenceCount = sequenceCount > maxSequenceCount ? sequenceCount : maxSequenceCount;
        }
        return maxSequenceCount;
    }
}
