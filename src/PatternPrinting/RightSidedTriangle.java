package PatternPrinting;
import java.util.Scanner;
public class RightSidedTriangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n+1-i;j++){
                System.out.print(" ");
            }
           for(int k=1;k<=i;k++){
               System.out.print("*");
           }
            System.out.println();
        }

    }
}
