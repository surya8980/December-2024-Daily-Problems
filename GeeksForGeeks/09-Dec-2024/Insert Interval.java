class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length == 0) {
            result.add(newInterval);
            return result;
        }
        ArrayList<int[]> intervalsList = new ArrayList<>();
        for (int[] interval : intervals) {
            intervalsList.add(interval);
        }
        intervalsList.add(newInterval);
        intervalsList.sort((a, b) -> Integer.compare(a[0], b[0]));
        result.add(intervalsList.get(0)); 
        for (int i = 1; i < intervalsList.size(); i++) {
            int[] lastInterval = result.get(result.size() - 1);
            int[] currentInterval = intervalsList.get(i);
            if (lastInterval[1] >= currentInterval[0]) {
                lastInterval[1] = Math.max(lastInterval[1], currentInterval[1]);
            } else {
                result.add(currentInterval);
            }
        }

        return result;
    }
}
