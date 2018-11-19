import java.util.*;
class FindDuplicate{

    static void findDuplicates(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<a.length-1; i++) {
            if(a[i] == a[i+1]) {
                list.add(a[i]);
            }
        }

        int total = ((a.length+1)*(a.length+2))/2;
        int total1 = 0;
        for(int i=0; i<a.length; i++) {
            total1 = total - a[i];

            if(list.get(i) == total1) {
                System.out.println(list.get(i));
                break;
            }
            list.add(total1);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3};
        findDuplicates(a);
    }
}