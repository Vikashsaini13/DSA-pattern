import java.util.*;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int pat=n;
        for(int i=1;i<=2*n-1;i++){
           for(int j=1;j<=space;j++){
            System.out.print("  ");
           }
           for(int j=1;j<=pat;j++){
            System.out.print("*"+" ");
           }

           if(i<n){
            space--;
            pat--;
           }
           else{
            space++;
            pat++;
           }
           
            System.out.println();
        }
    }
}
