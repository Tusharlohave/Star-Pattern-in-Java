// Write a java program to print the fololowing pattern:
// ******* 
//  ***** 
//   *** 
//    * 

public class Star9 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int k=4;k>=i;k--){
                System.out.print("*");
            }

            for(int l=3;l>=i;l--){
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}
