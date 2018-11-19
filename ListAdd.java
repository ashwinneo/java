import java.util.Arrays;

class ListAdd {

    public static void addList(int[] a) {
        System.out.println(a.length);
        int total = 0;
        int carry = 1;
        int[] result = new int[a.length];
        //System.out.println(Arrays.toString(result));
        for(int i=a.length-1;i>=0;i--) {
            total = a[i] + carry;
            if(total == 10) {
                carry = 1;
            }else {
                carry = 0;
                result[i] = total%10;
            }
        }
        if(carry == 1 ) {
            result = new int[a.length + 1];
            result[0] = 1;
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = {9,9};
        ListAdd.addList(arr);
    }
}