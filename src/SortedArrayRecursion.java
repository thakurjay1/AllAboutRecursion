public class SortedArrayRecursion {
    public static boolean sortedOrNot(int arr[],int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            //Array is sorted...
           return sortedOrNot(arr,index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
// Check if array is soretd (strictly Increasing).
          int arr[] = {1,2,3,4,3,6};
        System.out.println(sortedOrNot(arr,0));
    }
}
