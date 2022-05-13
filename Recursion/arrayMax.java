public class arrayMax {
    public static int printMax(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int prim = printMax(arr, idx + 1);
        if(prim > arr[idx]){
            return prim;
        }else{
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(printMax(arr, 0));
    }
}
