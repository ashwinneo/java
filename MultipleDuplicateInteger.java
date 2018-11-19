import java.util.Arrays;

class MultipleDuplicateInteger{

    static void duplicateIntegers(int[] a) {
        int[] count = new int[256];

        for(int i=0; i<a.length; i++) {
            count[a[i]]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=0; i<count.length; i++) {
            if(count[i] > 1) {
                System.out.printf("%d appears %d times \n" , i,  count[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,3,4};
        duplicateIntegers(a);

    }
}