import java.util.*;

public class no4 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  = ");
        n = in.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.print(i+" ");
            }else{
                temp=0;
            }
        }
        System.out.println();
    }
}
