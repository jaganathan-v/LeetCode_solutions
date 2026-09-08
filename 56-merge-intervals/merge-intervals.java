class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
    List<int[]> ls = new ArrayList<>();
    ls.add(intervals[0]);
    for(int i=0;i<intervals.length;i++){
        int[] last = ls.get(ls.size()-1);
        int[] current = intervals[i];
        if(current[0]<=last[1]){
            last[1]= Math.max(last[1],current[1]);
        }else{
            ls.add(current);
        }
    }
    return ls.toArray(new int[ls.size()][]);
    }
}