class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                arr1.add(nums[i]);
            }
            else if(nums[i]==pivot)
            {
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
            {
                arr2.add(nums[i]);
            }
        }

        int ans[]=new int[nums.length];
        ArrayList<Integer> combinedList = new ArrayList<>(arr1);
        combinedList.addAll(arr2);
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=combinedList.get(i);
        }
        return ans;
}
}