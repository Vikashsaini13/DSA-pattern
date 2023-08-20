import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j<i){
                   System.out.print(k++ +" ");
                }
                else{
                    System.out.print(k--+" ");
                }
            }
            System.out.println();
        }
    }
}
