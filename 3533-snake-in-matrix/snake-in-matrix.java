class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos=0;
        for(String c:commands)
        {
            if(c.equals("RIGHT"))
            {
                pos=pos+1;
            }
            if(c.equals("DOWN"))
            {
                pos=pos+n;
            }
             if(c.equals("UP"))
            {
                pos=pos-n;
            }
             if(c.equals("LEFT"))
            {
                pos=pos-1;
            }
        }
        return pos;
    }
}