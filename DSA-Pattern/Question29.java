import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                   System.out.print(i +" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
