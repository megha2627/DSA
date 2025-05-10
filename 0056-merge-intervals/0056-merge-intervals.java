import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] L = new int[intervals.length][2];
        int k = 0;

        int i = 0;
        while (i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Merge all overlapping intervals
            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }

            L[k][0] = start;
            L[k][1] = end;
            k++;
            i++;
        }

        // Resize array to only used part
        return Arrays.copyOf(L, k);
    }
}
