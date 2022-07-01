public class TowerOfHanoiRecursion {
    public static void towerOfHanoi(int n,String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n +" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n +" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"S","H","D");
    }
}


//RULES:-
//1. Only one disk transferred in one step.
//2. Smaller disks are always kept on top of larger disks .

//Point to Remember:- Time complexity of Tower of Hanoi = (2^n) - 1  = O(2^n).