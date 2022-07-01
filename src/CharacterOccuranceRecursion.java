public class CharacterOccuranceRecursion {
    public static int first = -1;
    public static int last = -1;

    public static void charOccurance(char element,int index,String str){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        charOccurance(element,index+1,str);
    }
    public static void main(String[] args) {
        String str = "bcaabbabbaacdavgjhjh ";
        charOccurance('a',0,str);
    }
}


//Time complexity is O(n).
