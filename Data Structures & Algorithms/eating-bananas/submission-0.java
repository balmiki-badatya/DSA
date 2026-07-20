class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMaxBanana(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(canFinishAllPiles(piles, mid, h)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    private int getMaxBanana(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int bananas : piles) {
            max = bananas > max ? bananas : max;
        }
        return max;
    }

    private boolean canFinishAllPiles(int[] piles, int bananas, int h) {
        int actualTimeTaken = 0;

        for (int pile : piles) {
            actualTimeTaken += Math.ceil((double)pile / bananas);
        }
        return actualTimeTaken <= h;
    }
}
