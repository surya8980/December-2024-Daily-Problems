class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n =values.length;
        int maxscore = values[0];
        int max=0;
        for (int i = 1; i < n; i++) {
            int currentRightScore = values[i] - i;
            max = Math.max(max, maxscore + currentRightScore);
            int currentLeftScore = values[i] + i;
            maxscore = Math.max(maxscore, currentLeftScore);
        }

        return max;
    }
}
