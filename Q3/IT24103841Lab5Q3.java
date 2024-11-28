import java.util.Scanner;

public class IT24103841Lab5Q3{
   public static void main(String[] args) {
       Scanner day = new Scanner(System.in); 
       System.out.print("Enter start date: ");
      int startDate = day.nextInt();
       System.out.print("Enter ending date: ");
       int endDate = day.nextInt();  
       if (startDate < 1 || startDate > 31) {
          System.out.println("Invalid start date. It should be between 1 and 31.");
           return;
       }
      if (endDate < 1 || endDate > 31) {
           System.out.println("Invalid end date. It should be between 1 and 31.");
           return;
       }
       if (startDate >= endDate) {
            System.out.println("Start date should be less than the end date.");
            return;
       }     
       int noOfDays = endDate - startDate;       
       double discountRate = 0;
      if (noOfDays >= 3 && noOfDays <= 4) {
           discountRate = 10; // 10% discount
       } else if (noOfDays > 4) {
          discountRate = 20; // 20% discount
       }      
       double roomChargePerDay = 48000.0;
       double totalAmount = noOfDays * roomChargePerDay * (1 - discountRate / 100);
      
       System.out.println("No of days reserved: " + noOfDays);
       System.out.printf("Total Amount to be paid: "+ totalAmount);

        day.close();
   }
}