public class Recursion6 {
    public static int calcPower(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x* calcPower(n-1,x);
    }
    public static void main(String[] args) {
//  print x^n (stack height = n).
//      Recursively calculate using memory stack.
        int x = 2, n=5;
        System.out.println(calcPower(n,x));
    }
}
