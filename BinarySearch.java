class BinarySearch {

     public static void binarySearch(int[] a, int first, int last, int key) {
        if(first > last) {
         System.out.println(1);;
        }

        int mid = first + last/2;

        System.out.println("middle" + mid);
        if(a[mid] > key) {
            
            binarySearch(a,first,mid,key);
        }
        if(a[mid] < key) {
            binarySearch(a,mid+1,last,key);
        }

        if(a[mid] == key) {
            System.out.println(mid);;
        }
    
       
       
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int first = 0;
        int last = a.length-1;
        int key = 1;
        BinarySearch.binarySearch(a, first, last, key);
    }
}