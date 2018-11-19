class SelectionSort {

    void sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+ ",");
        }
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr =  {4,2,3,5,2,100,20};
        s.sort(arr);
        s.printArray(arr);
    }
}