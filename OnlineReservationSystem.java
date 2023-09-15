import java.util.Scanner;

public class OnlineReservationSystem {
   private static boolean[] seats = new boolean[5];

   public OnlineReservationSystem() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      while(true) {
         while(true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            int var2 = var1.nextInt();
            switch (var2) {
               case 1:
                  viewSeatMap();
                  break;
               case 2:
                  ReserveSeat();
                  break;
               case 3:
                  CancelReservation();
                  break;
               case 4:
                  System.exit(0);
                  break;
               case 5:
                  System.out.println("Invalid Option");
            }
         }
      }
   }

   private static void viewSeatMap() {
      System.out.println("\nCurrent Seat Map: ");

      for(int var0 = 0; var0 < seats.length; ++var0) {
         if (seats[var0]) {
            System.out.print("X");
         } else {
            System.out.print(var0 + 1 + " ");
         }
      }

      System.out.println();
   }

   private static void ReserveSeat() {
      Scanner var0 = new Scanner(System.in);
      System.out.print("\nEnter seat number (1-5): ");
      int var1 = var0.nextInt();
      if (var1 >= 1 && var1 <= 5) {
         if (seats[var1 - 1]) {
            System.out.println("Seat already reserved!");
         } else {
            seats[var1 - 1] = true;
         }
      } else {
         System.out.println("Invalid seat number!");
      }

   }

   private static void CancelReservation() {
      Scanner var0 = new Scanner(System.in);
      System.out.print("\nEnter seat number (1-5): ");
      int var1 = var0.nextInt();
      if (var1 >= 1 && var1 <= 5) {
         if (!seats[var1 - 1]) {
            System.out.println("Seat not reserved!");
         } else {
            seats[var1 - 1] = false;
         }
      } else {
         System.out.println("Invalid seat number!");
      }

   }
}
