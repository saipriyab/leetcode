leetcoe url: https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String people[]=new String[heights.length];
        TreeMap<Integer,String> peopleMap=new TreeMap<>();
        int i=0;
        for(i=0;i<heights.length;i++)
        {
            peopleMap.put(heights[i],names[i]);
        }
        i=heights.length-1;
        for(Map.Entry<Integer,String> ppl:peopleMap.entrySet())
        {
            people[i]=ppl.getValue();
            i--;
        }
        return people;
    }
}
