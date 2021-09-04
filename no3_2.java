import java.util.*;

public class no3_2 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                if(k>1 && k <(i*2)-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
