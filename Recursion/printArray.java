public class printArray {
    /**
     * Expectation --> da(arr,0) will print elements from 0 to n
     * Faith --> da(arr,1) will print elements from 1 to n
     * print 1st element then call da(arr,1)
     * @param arr
     * @param idx
     */
 
    public static void displayArray(int[] arr, int idx){
        if(arr.length == idx){
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {3,10,20,30};
        displayArray(arr, 0);
    }
}
