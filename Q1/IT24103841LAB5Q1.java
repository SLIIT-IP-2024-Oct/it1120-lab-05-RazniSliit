import java.util.Scanner;

public class IT24103841LAB5Q1 {
   public static void main(String[] args) {
    Scanner mem = new Scanner(System.in);
     System.out.print("Enter the number of new members introduced: ");
     int newMembers = mem.nextInt(); 
     String prize;     
      if (newMembers < 0) {
          System.out.println("Input must be a number 0 or greater");
      } else {   
         switch (newMembers) {
              case 0:
                 prize = "No Prize";
                 break;
              case 1:
                 prize = "Pen";
                 break;
               case 2:
                    prize = "Umbrella";
                    break;
               case 3:
                  prize = "Bag";
                   break;
               case 4:
                  prize = "TravellingChair";
                  break;        
               default:
                   prize = "Headphone";
                   break;
                    
     }
      System.out.println("Prize is a :"+prize);
    }

    mem.close();
    }
}