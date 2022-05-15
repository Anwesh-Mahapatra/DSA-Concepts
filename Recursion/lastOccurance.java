public class lastOccurance {
    /**
     * Print the last index of a particular element in an array
     */
    public static int printLast(int[] arr, int idx, int data){
        if(idx == arr.length-1){
            return -1;
        }
        int li = printLast(arr, idx+1, data);
        if(li == -1){
            if(arr[idx] == data){
                return idx;
            }else{
                return -1;
            }
        }else{
            return li;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5};
        System.out.println(printLast(arr, 0, 5));
    }
}
