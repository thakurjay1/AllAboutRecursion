public class Recursion4 {
    /*public static void printfactorial(int i,int n,int mul){
        if(i==n){
            mul*=i;
            System.out.println(mul);
            return;
        }
        mul*=i;
        printfactorial(i+1,n,mul);
    }*/

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
//  Print factorial of a number.
       // printfactorial(1,5,1);
        System.out.println(factorial(5));
    }
}
