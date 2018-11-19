import java.util.ArrayList;
import java.util.Collections;

class BinaryAdd {

    public static void add(int[] a,int[] b) {
        int carry = 0;
        int sum =0;
        ArrayList<Integer> binaryLlist = new ArrayList<>();
        for(int i=a.length-1; i>=0; i--) {
            // if(carry == 0) {
            //     if(a[i] == 0 && b[i] == 0) {
            //         binaryLlist.add(0);
            //         carry = 0;
            //     }
            //     else if(a[i] == 0 && b[i] == 1) {
            //         binaryLlist.add(1);
            //         carry = 0;
            //     }
            //     else if(a[i] == 1 && b[i] == 0) {
            //         binaryLlist.add(1);
            //         carry = 0;
            //     }
            //     else if(a[i] == 1 && b[i] == 1) {
            //         binaryLlist.add(0);
            //         carry = 1;
            //     }
            // }
            // else{
            //     if(a[i] == 0 && b[i] == 0) {
            //         binaryLlist.add(1);
            //         carry = 0;
            //     }
            //     else if(a[i] == 0 && b[i] == 1) {
            //         binaryLlist.add(0);
            //         carry = 1;
            //     }
            //     else if(a[i] == 1 && b[i] == 0) {
            //         binaryLlist.add(0);
            //         carry = 1;
            //     }
            //     else if(a[i] == 1 && b[i] == 1) {
            //         binaryLlist.add(1);
            //         carry = 1;
            //     }
            // }
            // if(i==0) {
            //     binaryLlist.add(carry);
            // }
            
            binaryLlist.add((a[i] + b[i] + carry) % 2);
            if(a[i] + b[i] + carry >=2) {
                carry = 1;
            }
            else {
                carry = 0;
            }
        }
        binaryLlist.add(carry);
        Collections.reverse(binaryLlist);
        System.out.print(binaryLlist);
    }


    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        int[] b = {1,1,1,1};
        BinaryAdd.add(a,b);
    }
    
}