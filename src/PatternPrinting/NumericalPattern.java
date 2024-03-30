package PatternPrinting;
import java.util.Scanner;
public class NumericalPattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2!=0 ){
                    System.out.print(2);
                }
                else{
                    System.out.print(1);
                }

            }
            System.out.println();
        }

    }
}
