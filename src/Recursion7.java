public class Recursion7 {
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        return x * calcPower(x,n/2) * calcPower(x,n/2);

    }
    public static void main(String[] args){
// print x^n (stack height = log n).
        int x = 2, n = 4;
        System.out.println(calcPower(x,n));
    }
}
