class MissingNumber{

    static int missingNumber(int[] a) {
        int n = a.length;

        int total = ((n+1) * (n+2))/2;
        for(int i=0; i<a.length; i++) {
            total -= a[i];
        }
        return total;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,8};
        int n = missingNumber(a);
        System.out.println(n);
    }
}