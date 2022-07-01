public class TilesProblemRecursion {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //Vertical placements:-
        int verticalPlacements = placeTiles(n-m,m);

        //Horizontal Placements:-
        int horizontalPlacements = placeTiles(n-1,m);

        return verticalPlacements+horizontalPlacements;
    }
    public static void main(String[] args) {
// Place tiles of size 1*m in a floor of size n * m.
        int n=4,m=2;
        System.out.println( placeTiles(n,m));
    }
}
