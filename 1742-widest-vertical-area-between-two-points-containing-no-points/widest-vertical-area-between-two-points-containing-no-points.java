import java.util.*;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> xValues = new ArrayList<>();

        // Step 1: Extract x-coordinates
        for (int i = 0; i < points.length; i++) {
            xValues.add(points[i][0]);
        }

        // Step 2: Sort x-coordinates
        Collections.sort(xValues);

        // Step 3: Find maximum gap
        int maxGap = 0;
        for (int i = 1; i < xValues.size(); i++) {
            maxGap = Math.max(maxGap, xValues.get(i) - xValues.get(i - 1));
        }

        return maxGap;
    }
}
