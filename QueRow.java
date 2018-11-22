class QueRow {

    public static int countRow(int[] a) {
        int n = a.length;
        int count = 1;
        int leader = a[0];

        for(int i=1; i<n; i++) {
            if(leader < a[i]) {
                leader = a[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,6,1,0,2,3,7};
        int n = countRow(a);
        System.out.println(n);
    }
} 