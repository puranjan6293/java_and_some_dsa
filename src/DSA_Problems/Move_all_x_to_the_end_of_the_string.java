package DSA_Problems;
//Move all x to the end of the string
public class Move_all_x_to_the_end_of_the_string {
    public static void moveAllX(String str,int idx,int count, String newString){
        //base condition, step5
        if(idx==str.length()){
            for (int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        //step1
        char current = str.charAt(idx);
        //step2
        if(current=='x'){
            count++;
            //step3
            moveAllX(str,idx+1,count,newString);
        }
        //step4
        else{
            newString+=current; //new string = newString +currentChar
            moveAllX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxdx";
        moveAllX(str,0,0,"");
    }
}
