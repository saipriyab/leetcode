class Solution {
    public int maxRepeating(String sequence, String word) {
        int cnt=0;
        for(int i=0;i<sequence.length();i++)
        {
            for(int j=i+1;j<=sequence.length();j++)
            {
                if(sequence.substring(i,j).equals(word))
                    cnt++;
            }
        }
        return cnt;
    }
}
