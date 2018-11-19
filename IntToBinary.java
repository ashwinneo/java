import java.util.*;
class IntToBinary {
    public static void convertToBinary(int num) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0) {
            if(num % 2 == 0) {
                list.add(num%2);
                num = num/2;
            } else if(num % 2 == 1) {
                list.add(num%2);
                num = (num-1)/2;
            } 
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        IntToBinary.convertToBinary(2);
    }
}