public class allOccurrance {
    /**
     * This function prints out all the indices of data in a given array
     * @param arr
     * @param idx
     * @param data
     * @param fsf --> Found so far, how many times we have found 'data' till now
     * @return
     */
    public static int[] allIndices(int[] arr, int data, int idx, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == data){
            int[] air = allIndices(arr,data,idx+1,fsf+1);
            air[fsf] = idx;
            return air;
        }else{
            int[] air = allIndices(arr,data,idx+1,fsf);
            return air;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4};
        int[] res = allIndices(arr, 4, 0, 0);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        }
    }
