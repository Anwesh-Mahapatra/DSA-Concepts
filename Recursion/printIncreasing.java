public class printIncreasing {

    public static void printI(int n){
        if(n == 0){
            return;
        }
        printI(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printI(10);
    }
}
