public class displayReverse {
    /**
     * Print array in reverse order
     * @param arr
     * @param idx
     */
    public static void reverseLoda(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        reverseLoda(arr, idx + 1);
        System.out.println(arr[idx]);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseLoda(arr, 0);
    }
}
