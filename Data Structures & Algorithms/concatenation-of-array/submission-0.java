class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatinatedArray = new int[(nums.length)*2];
        int arrIndex = 0;
        for(int i=0; i<2; i++){
            for(int j=0;j<nums.length;j++){
                concatinatedArray[arrIndex++] = nums[j];
            }
        }
        return concatinatedArray;      
    }
}