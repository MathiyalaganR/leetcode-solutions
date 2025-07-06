class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> arr = new ArrayList<>();
        int prev = -10000;  

       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            arr.add(i - prev);
        }

        prev = 10000;  

       
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            arr.set(i, Math.min(arr.get(i), prev - i));
        }

        
        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }

        return array;
    }
}
