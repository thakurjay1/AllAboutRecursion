public class ReverseStringRecursion {
    public static void printReverse(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str,index-1);
    }
    public static void main(String[] args) {
// Print a string in reverse.
        String str = "jaythakur";
        printReverse(str,str.length()-1);
    }
}



//Time Complexity is O(n),where n = String length.