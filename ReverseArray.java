import java.util.Arrays;

class ReverseArray {


    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5};
        int temp = 0;
        int i =0;
        int j = a.length-1;

        while(i<j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}