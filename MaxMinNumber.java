class MaxMinNumber{



    public static void main(String[] args) {
        int[] a = {3,2,1,4,5};

        int max = 0;
        int min = a[0];
        for(int i=0; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        for(int i=1; i<a.length-1; i++) {
            if(min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}