package com.mycompany.discountchecker;

import java.util.Scanner;

/**
 *
 * @author rabic
 */
public class DiscountChecker {

    public static void main(String[] args) {

        
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your MemberShipStatus - Either Approved or no approved");
        String MembershipStatus = input.nextLine().toLowerCase();
        System.out.println("WHat is your Age");      
        Integer Age = Integer.parseInt(input.nextLine());

        
        boolean Discount = false;
        
        if ((Age >= 18) || (MembershipStatus.equals("approved"))) {    
             System.out.println("You have Gotten the discount");  
        }        else
        {
            System.out.println("You have not received the discount");
        }

        
    }
}
