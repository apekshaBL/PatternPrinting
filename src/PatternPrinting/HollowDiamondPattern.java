package PatternPrinting;
import java.util.Scanner;
public class HollowDiamondPattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                if(j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
          for(int j=1;j<=i;j++){
              if(j==i){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
          }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
               if(j==i){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            for(int j=i;j<=n;j++){
                if(j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
 }
}
