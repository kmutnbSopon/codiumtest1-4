public class fizzbuzz {
    public static void main(String[] args) {

        String[] result = new String[101];
        for (int i = 0,pos = 0; i < 101; i++,pos++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if ((fizz==true) && (buzz==true)){
                result[pos] = "FizzBuzz";
            }else if(fizz == true){
                result[pos] = "Fizz";
            }else if(buzz == true){
                result[pos] = "Buzz";
            }else{
                result[pos] = String.valueOf(i);
            }
        }
        for(int j =0;j<=100;j++){
            System.out.print(result[j]+" ");
            if(j%20==0){
                System.out.println();
            }
        }
    }
}