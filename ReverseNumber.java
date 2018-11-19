class ReverseNumber{

    static boolean reverseNumber(Integer x) {
        // int sum = 0;
        // int r = 0;
        // while(n>0) {
        //     sum = sum*10 + n %10;
        //     n = n/10;
        // }
        // // String s1 = n.toString();
        // // System.out.println(s1);
        // // StringBuffer sb = new StringBuffer(s1);
        // // sb.reverse();
        // //return Integer.parseInt(sb.toString());
        // return sum;
        int sum = 0;
        int temp = x;
        int r = 0;
        if(x < 0) {
            return false;
        }
        
        while(temp != 0) {
            r = temp %10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        
        if(sum == x) {
            return true;
        }
        return false;



    }
    public static void main(String[] args) {
        boolean n = reverseNumber(342);
        System.out.println(n);
    }
}

