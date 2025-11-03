class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> a=new ArrayList<>();
        Arrays.sort(intervals,(a1,b1)->Integer.compare(a1[0],b1[0]));
        for(int i=0;i<intervals.length;i++){
            int max=intervals[i][1];
            int min=intervals[i][0];
            while(i+1<intervals.length && max>=intervals[i+1][0]){
                
                max=Math.max(max,intervals[i+1][1]);
                i++;
            }
            a.add(new int[]{min,max});
        }
        int[][] arr=a.toArray(new int[a.size()][2]);
        return arr;
        
    }
}