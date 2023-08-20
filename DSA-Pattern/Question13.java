import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pat=1;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=pat;j++){
                System.out.print("* ");
            }
            if(i<n){
                pat++;
            }
            else{
                pat--;
            }
           
            System.out.println();
        }
    }
}
