class Solution {
    public void sortColors(int[] nums) {
        int len =nums.length;
        int[] arr=new int[len];
        int min=nums[0];
        for(int i=0;i<len-1;i++)
        {
           
            for(int j=0;j<len-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            
        }
        
    }
}