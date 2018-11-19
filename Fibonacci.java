class Fibonacci{

    static int calFibonacci(int n) {
        int[] output = new int[n+1];

        output[0] = 0;
        output[1] = 1;

        for(int i=2; i<=n; i++) {
            output[i] = output[i-1] + output[i-2];
        }

        return output[n]; 

    }
    public static void main(String[] args) {
      int n = Fibonacci.calFibonacci(4);
      System.out.println(n);
    }
}    