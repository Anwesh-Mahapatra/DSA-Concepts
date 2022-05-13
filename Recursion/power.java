public class power {
    public static int powerRecursive(int x, int n){
        /**
         * Expectation --> p(x,n) can give us x multiplied n times
         * Faith --> p(x,n-1) can give us x multiplied n-1 times
         * x * p(x,n-1) --> will give the answer
         */
        if(n == 0){
            return 1;
        }
        int xnm1 = powerRecursive(x, n-1);
        int xm = x * xnm1;
        return xm;
    }
    /**
     * A power function that runs in log(n)
     */
    public static int fastPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int res = fastPow(x, n/2);
        int xn = res*res;
        if(n%2 == 1){
            xn = xn * x;
        }
        return xn;
    }

    public static void main(String[] args) {
        // System.out.println(powerRecursive(2, 2));
        System.out.println(fastPow(2, 2));
    }
}
