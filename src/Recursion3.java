public class Recursion3 {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);


    }
    public static void main(String[] args) {
//  Print sum of first n natural numbers.
        printSum(1,5,0);
    }
}
