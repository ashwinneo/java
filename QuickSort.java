class QuickSort {

    public static int sortQuick(int[] arr, int first, int last) {

        int i = first - 1;
        int pivot = arr[last];
        for(int j=first; j<last ;j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }  
        System.out.println("i" + i);
        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        return i+1;             
    }

    public static void sort(int[] arr, int first, int last) {
        if(first < last) {
            int pi = sortQuick(arr,first,last);
            //System.out.println(pi);
            sort(arr,first,pi-1);
            sort(arr,pi+1,last);
        }
    }

    static void printArray(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,2,10,30};
        int first = 0;
        int last = a.length-1;
        QuickSort.sort(a, first, last);
        QuickSort.printArray(a);
    }
}