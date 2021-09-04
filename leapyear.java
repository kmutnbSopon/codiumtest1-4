import java.util.*;
public class leapyear {

    public static void main(String[] args) {
  
      int year ;
      boolean leap = false;
      Scanner in = new Scanner(System.in);
        System.out.print("Input the year : ");
        year = in.nextInt();
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0)
            leap = true;
          else
            leap = false;
        }
        else
          leap = true;
      }
      else
        leap = false;
        
      if (leap)
        System.out.println(year + " -> true");
      else
        System.out.println(year + " -> false");
    }
  }