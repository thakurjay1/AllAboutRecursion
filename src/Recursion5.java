public class Recursion5 {
    public static void printfibonacci(int n,int n1,int n2){
        if(n==0){
            return;
        }
        int n3 = n1+n2;
        System.out.println(n3);
        printfibonacci(n-1, n2,n3);
    }
    public static void main(String[] args) {
//  Print the fibonacci sequence till nth term.
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n = 7;
        printfibonacci(n-2,n1,n2);
    }
}
