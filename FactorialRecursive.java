class FactorialRecursive {

    static int factorial(int n) {
        if(n<=1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 

    public static void main(String[] args) {
        int n = FactorialRecursive.factorial(4);
        System.out.println(n);


        int fib = FactorialRecursive.fib(6);
        System.out.println(fib);
    }
}