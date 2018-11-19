import java.util.Arrays;

class CountingSort {

    static int countSort(int[] arr, int n) {
        int[] output = new int[n];

        int[] count = new int[256];

        for(int i=0;i<n;i++) {
            ++count[arr[i]];
        }
        //System.out.print(Arrays.toString(count));


        for(int i=1; i<n;i++) {
            count[i] += count[i-1];
        }
        
        System.out.println(Arrays.toString(count));

        System.out.println(count[3] - count[2-1]);
        
        
        for (int i=0; i<=n-1; i++) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
       //System.out.print(Arrays.toString(output)) a=3 b=2;
       
        for (int i=n-1; i>-0; i--) 
            arr[i] = output[i];

            //System.out.println(Arrays.toString(arr));
        return arr.length;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2};
        int n = a.length;
        n = CountingSort.countSort(a,n);
        //System.out.println(Arrays.toString(a));
    }
}