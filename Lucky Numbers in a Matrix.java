//leetcode link
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> lucky=new ArrayList<>();
        int i=0,j=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,num=0;
        for(i=0;i<matrix.length;i++)
        {
            min=Integer.MAX_VALUE;
            for(j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    num=i;
                }
            }
           map.put(num,min);
        }
        num=0;
       
         for(i=0;i<matrix[0].length;i++)
        {
            max=Integer.MIN_VALUE;
            for(j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]>max)
                {
                    max=matrix[j][i];
                    num=j;
                }
            }
            if(!map.containsKey(num))
            {
                
            map.put(num,max);
            }
            else
            {
                if(map.get(num)==max)
                {
                   
                    lucky.add(max);
                }
            }

        }
       return lucky;
    }
}
