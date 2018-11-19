class MergeSort {

    void sort(int[] arr,int p, int q){
        if(p < q) {
            int middle = (p+q)/2;
            System.out.println(middle);
            sort(arr,p,middle);
            sort(arr,middle+1,q);
        }
        
    }


    public static void main(String[] args) {

        int[] array = {4,2,3,5,6,1};
        MergeSort ms = new MergeSort();
        int start = 0;
        int end = array.length-1;
        ms.sort(array,start,end);

    }
}