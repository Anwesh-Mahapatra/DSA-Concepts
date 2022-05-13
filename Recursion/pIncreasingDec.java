public class pIncreasingDec {
    /**
     * pID function takes an integer value 'n'
     * It prints first from n to 1 and then from 1 to n
     * @param n
     */
    public static void pID(int n){
        /**
         * Expectation --> pID(4) will print 4 to 1 and then 1 to 4
         * Faith --> pID(3) will print 3 to 1 and 1 to 3
         * Using the faith now we meet expectation by printing 4, then calling pID(3), then printing 4
         */
        if(n == 0){
            return;
        }
        System.out.println(n);
        pID(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        pID(5);
    }
}
