package PatternPrinting;
import java.util.Scanner;
public class TriangularPattern2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=r+i-r;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
