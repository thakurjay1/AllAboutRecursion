public class StringRecursion {
    public static void charShift(int index,String str,int count,String newString){
        if(index == str.length()){
            for(int i=0;i<count;i++){
                newString+="x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar =='x'){
            count++;
            charShift(index+1,str,count,newString);
        }else{
            newString+=currChar;    //newString = newString + char
            charShift(index+1,str,count,newString);
        }
    }
    public static void main(String[] args) {
// Move all 'x' to the end of  the string.
        String str = "axbcxxd";
        charShift(0,str,0,"");
    }
}


//Time complexity = O(n+count) = O(2n) = O(n).
