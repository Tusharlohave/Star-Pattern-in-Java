// Write a java program to print the following pattern:
//    * 
//     * 
//      * 
//       *

public class Star10 {
    public static void main(String agrs[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
