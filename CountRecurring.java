import java.util.ArrayList;
import java.util.Arrays;

class CountRecurring{

    public static int[] getRecurringCount(int[] a) {
        int[] count = new int[256];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            count[a[i]]++;
        }
        int k = 0;
        Arrays.sort(a);
        int[] temp = new int[a.length];
        for(int i=0; i<a.length-1; i++){
            if(a[i] != a[i+1]) {
                temp[k++] = a[i];
            }
        }
        temp[k++] = a[a.length-1];
        return temp;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,5,5,1,2,3,8};

        int[] r = CountRecurring.getRecurringCount(a);
        System.out.println(Arrays.toString(r));
        
    }
}