class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int [] a, int [] b)->{
            double ratio1= (double)a[0]/a[1];
            double ratio2 =(double) b[0]/b[1];
            double imp1= (double)(a[0]+1)/(a[1]+1)-ratio1;
            double imp2 =(double) (b[0]+1)/(b[1]+1)-ratio2;
            return Double.compare(imp2,imp1);
        });
        for(int [] cls : classes){
            pq.add(cls);
        }
        while(extraStudents>0){
            int [] top = pq.poll();
            int pass = top[0];
            int total=top[1];
            extraStudents--;
            pass++;
            total++;
            pq.add(new int[]{pass,total});
        }
        double res =0;
        while(!pq.isEmpty()){
            int [] top = pq.poll();
            res+=(double)top[0]/top[1];
        }
        return res/classes.length;
    }
}
