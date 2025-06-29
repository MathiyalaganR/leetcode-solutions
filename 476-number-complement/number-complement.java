class Solution {
    public int findComplement(int num) {
        String binary =Integer.toBinaryString(num);
        String com="";
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            {
                com=com+'0';
            }
            else
            {
                com=com+'1';
            }
        }
        int ans=Integer.parseInt(com,2);
        return ans;
    }
}