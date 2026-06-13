class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            for(int rightP = i+1; rightP < arr.length; rightP++){
                max = (arr[rightP] > max) ? arr[rightP] : max;
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length - 1] = -1;
        return arr;  
    }
}