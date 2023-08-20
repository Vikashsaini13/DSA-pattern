import java.util.*;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int x=n/2;

        for(int i=1;i<=x;i++){
            for(int j=i;j<=x;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=x;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            System.out.print("  ");
        }
        System.out.println();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*x-2*i +1;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
