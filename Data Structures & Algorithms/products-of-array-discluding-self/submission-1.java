class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArr = new int[nums.length];
        int rightIndexValue = 1;
        productArr[0] = 1;

        for(int index = 1; index < nums.length; index++) {
            productArr[index] = productArr[index - 1] * nums[index - 1];
        }

        for(int index = nums.length - 1; index >= 0; index--) {
            productArr[index] = rightIndexValue * productArr[index];
            rightIndexValue *= nums[index];
        }


        return productArr;
    }
}  
