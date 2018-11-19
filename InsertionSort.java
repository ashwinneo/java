class InsertionSort {

    void sort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int value = i;
            while(value>0 && arr[value-1]<key) {
                arr[value] = arr[value-1];
                value = value - 1;

            }
            arr[value] = key;
        }
    }

    static void insertonSort(int[] arr, int n) {
        
        if(n==1) {
            System.out.println(arr[0]);
        }

        insertonSort(arr, n-1);

        int key = arr[n-1];
        int j = arr[n-1];
        while(j>0 && arr[j-1] > key) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = arr[j-1];
    }

    public static void main(String[] args) {
        InsertionSort sort12 = new InsertionSort();
        int[] b = {3,100,2,1,4,10,6,20};
        InsertionSort.insertonSort(b,b.length);
        for(int i=0; i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
}