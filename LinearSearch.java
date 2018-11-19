class LinearSearch {

   public static int linearSearch(int[] a, int key) {
        
        int s = 0;
        for(int i=0; i < a.length-1; i++) {
            if(key == a[i]) {
                s = i;
            }
        }
        return s;
    }


    public static void main(String[] args) {
        int[] a = {2,4,5,6};
        int key = 6;
        int ab = LinearSearch.linearSearch(a,key);
        System.out.println(ab);

    } 
}