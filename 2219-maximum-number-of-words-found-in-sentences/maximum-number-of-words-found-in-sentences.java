class Solution {
    public int mostWordsFound(String[] sentences) {
       
        int max=0;
       
        for(int i=0;i<sentences.length;i++)
        {
            int c=sentences[i].split(" ").length;
            if(max<c)
            {
                max=c;
            }
            
        }
        return max;
    }
}