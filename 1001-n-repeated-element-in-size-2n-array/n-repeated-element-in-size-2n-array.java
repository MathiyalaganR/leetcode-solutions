class Solution {
    public int repeatedNTimes(int[] nums) {
        int c=0;
        int max=0;
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(max<c)
             {
                max=c;
                num=nums[i];
             }
             c=0;
        }
        return num;
    }
}