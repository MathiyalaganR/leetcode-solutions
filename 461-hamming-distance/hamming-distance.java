class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = Integer.toBinaryString(x);
        String str2 = Integer.toBinaryString(y);

       
        int maxLen = Math.max(str1.length(), str2.length());
        while (str1.length() < maxLen) {
            str1 = "0" + str1;
        }
        while (str2.length() < maxLen) {
            str2 = "0" + str2;
        }

       
        int c = 0;
        for (int i = 0; i < maxLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                c++;
            }
        }
        return c;
    }
}
