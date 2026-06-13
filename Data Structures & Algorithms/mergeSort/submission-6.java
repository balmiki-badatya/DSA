// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    // int mid = -1;
    public List<Pair> mergeSort(List<Pair> pairs) {
        return sort(pairs);
        // return pairs;
    }

    private List<Pair> sort(List<Pair> pairs) {
        if (pairs.size() <= 1) {
            return pairs;
        }
        int mid = pairs.size() / 2;
        List<Pair> leftPair = mergeSort(pairs.subList(0, mid));
        List<Pair> rightPair = mergeSort(pairs.subList(mid , pairs.size()));
        return merge(leftPair, rightPair);
    }

    private List<Pair> merge(List<Pair> leftPairs, List<Pair> rightPairs) {
        List<Pair> tempList = new ArrayList();
        int left = 0;
        int right = 0;
        while (left < leftPairs.size() && right < rightPairs.size()) {
            if (leftPairs.get(left).key <= rightPairs.get(right).key) {
                tempList.add(leftPairs.get(left));
                left += 1;
            } else {
                tempList.add(rightPairs.get(right));
                right += 1;
            }
        }

        while (left < leftPairs.size()) {
            tempList.add(leftPairs.get(left));
            left += 1;
        }

        while (right < rightPairs.size()) {
            tempList.add(rightPairs.get(right));
            right += 1;
        }
        return tempList;
    }
}
