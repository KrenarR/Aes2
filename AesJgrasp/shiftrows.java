 /*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */

//package Shiftrow;

/**
 *
 * @author mohamed
 */
public class shiftrows {
    
    /** Creates a new instance of shiftrows */
    public shiftrows() {
    }
    public String[][] shiftrows(String state[][])
    {
       for(int i=1;i<4;i++)
       {
           state=rowshift(i,state);
       }
        return state;
    }
    public String[][] rowshift(int row,String[][] state)
    {
         String temp;
         for(int num=0;num<row;num++)
         {
        temp=state[row][0];
        for(int i=0;i<3;i++)
        {
            state[row][i]=state[row][i+1];
        }
         state[row][3]=temp;
         }
         return state;
    }
     
    
}
 /*
 *   *       Please Visit us at www.codemiles.com     *
 *  This Program was Developed by www.codemiles.com forums Team
 *  *           Please Don't Remove This Comment       *
 */