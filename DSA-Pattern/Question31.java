import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                if(i+j==n+1){
                    System.out.print("* ");
                }
                else
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
