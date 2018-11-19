import java.util.Arrays;

class SortIndex {

    static void indexSort(int[] a, int[] index) {
        int[] temp = new int[a.length];

        for(int i=0; i<temp.length; i++) {
            temp[index[i]] = a[i];
        }

        for(int i=0; i<temp.length; i++) {
            a[i] = temp[i];
            index[i] = i;
        }
    }

    public static void main(String[] args) {
        int[] a = {50, 40, 70, 60, 90};
        int[] index = {3,  0,  4,  1,  2};
        SortIndex.indexSort(a, index);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(index));
    }
}