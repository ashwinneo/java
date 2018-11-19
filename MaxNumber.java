class MaxNumber {

    static int max(int[] a, int s, int m, int l) {

        int lmax = 0;
        int rmax = 0;
        for(int i=m;i>=0;i--) {
            if(lmax < a[i]) {
                lmax = a[i];
            }
        }

        for(int i=m+1;i<=l;i++) {
            if(rmax < a[i]) {
                rmax = a[i];
            }
        }

        return (lmax > rmax) ? lmax : rmax;
    }

    static int sort(int[] a, int s, int l) {
        if(s == l) {
            return a[s];
        }
        int m = (s+l)/2;

        sort(a,s,m);
        sort(a,m+1,l);

       return max(a,s,m,l);
    }

    public static void main(String[] args) {
        int[] a = {12,17,24,5,16};
        int max = MaxNumber.sort(a, 0, a.length-1);
        System.out.println(max);
    }
}