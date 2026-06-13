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
        if (pairs.size() == 0 || pairs.size() == 1) {
            return pairs;
        }
        int mid = pairs.size() / 2;
        List<Pair> leftPair = mergeSort(pairs.subList(0, mid));
        List<Pair> rightPair = mergeSort(pairs.subList(mid, pairs.size()));
        return Stream.concat(leftPair.stream(), rightPair.stream())
            .sorted(Comparator.comparing(pair -> pair.key))
            .toList();
    }
}
