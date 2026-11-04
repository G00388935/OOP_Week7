package ie.atu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("What is the name of your Workshop");
         String workshopName = input.nextLine();

         System.out.println("How big is the capacity?");
         int capacity = Integer.parseInt(input.nextLine());

         System.out.println("How many registrations do you want?");
         int registrations = Integer.parseInt(input.nextLine());

         Workshop workshop = new Workshop(workshopName, capacity);
         System.out.println(workshop);

         //System.out.println("workshop name: "+workshopName);//testing code
         //System.out.println("Capacity: "+capacity);// testing code


         System.out.println("Number of registration attempts: "+registrations);
         for (int i = 1; i <= registrations; i++)
         {
             System.out.println("Registration #"+i);

             //String studentIds  = input.nextLine();
             //hash set wont add the same registration more than once
         }


    }
}