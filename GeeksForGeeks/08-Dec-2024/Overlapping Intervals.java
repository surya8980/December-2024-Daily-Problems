class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        if (arr.length == 0)
            return res;
        res.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int[] end = res.getLast();
            if (end[1] >= arr[i][0]) {
                end[1] = Math.max(end[1], arr[i][1]);
            } else {
                res.add(arr[i]);
            }
        }
        return res;
    }
}
