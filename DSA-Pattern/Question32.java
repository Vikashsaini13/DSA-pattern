import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int pattern=1;
        int x=2*n-1;

        int k;
        for(int i=1;i<=x;i++){
            if(i<n){
                k=i;
            }
            else{
                k=x-i+1;
            }
            for(int j=1;j<=pattern;j++){
                if(j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(k+" ");
                }
               
            }
            if(i<n){
                pattern+=2;
            }
            else{
                pattern-=2;
            }
            System.out.println();
        }
    }
}
