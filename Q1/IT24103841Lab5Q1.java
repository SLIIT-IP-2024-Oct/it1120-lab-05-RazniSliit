import java.util.Scanner;

public class IT24103841Lab5Q1 {
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
        
      System.out.println("Enter the first integer:");
      int F_num = num.nextInt();
         
      System.out.println("Enter the second integer:");
       int S_num = num.nextInt();
         
      System.out.println("Enter the third integer:");
     int T_num = num.nextInt();
          
      int large = F_num;
      if (S_num > large) {
            large = S_num;
      }
      if (T_num > large) {
            large = T_num;
       }
    
      int Small = F_num;
      if (S_num < Small) {
       Small = S_num;
        }
     if (T_num < Small) {
     Small = T_num;
      }

    System.out.println("User entered numbers are: " + F_num + ", " + S_num + ", " + T_num);
   System.out.println("The Smallest number is: " + Small); // Correct concatenation with +
   System.out.println("The Largest number is: " + large); // Correct concatenation with +
  }
}