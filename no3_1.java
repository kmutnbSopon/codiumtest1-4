import java.util.*;

public class no3_1 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                // System.out.print("*"+" ");
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
