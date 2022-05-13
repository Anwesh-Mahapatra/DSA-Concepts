public class firstOccurance {
    /**
     * Expectation --> fi(arr,0,d) will return us the first occurance from index 0
     * Faith --> fi(arr,1,d) will give the first occurance of d from index 1 to last
     * Approach --> Mix the checks with the recursive calls in order to reduce time
     * @param arr
     * @param idx
     * @param data
     * @return
     */
    public static int firstIndex(int[] arr, int idx, int data){
        if(idx == arr.length-1){
            return -1;
        }
        if(arr[idx] == data){
            return idx;
        }else{
            int fi = firstIndex(arr, idx+1, data);
            return fi;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,50,23,40,50,50,50};
        System.out.println(firstIndex(arr, 0, 50)); 
    }
}
