import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int p=n/2 +1;
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                if(j==1 || j==star){
                 System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i<p){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
        }
    }
}
