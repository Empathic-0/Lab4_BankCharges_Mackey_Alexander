/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter the amount of bank checks you wrote this month: ");
    Scanner input = new Scanner(System.in);
    BankServiceFeeEstimator bankServiceFeeEstimator = new BankServiceFeeEstimator();
    int BaseChargePerMonth = 10;
    int NumberofChecks = 0;
    boolean IsValid = false;
    double Multiplier = 0;
    while (!IsValid) { 
      if (input.hasNextInt()) {
        NumberofChecks = input.nextInt() ;
        if (NumberofChecks <0 ) {
          System.out.println("That number is invalid.") ;
          System.out.print("Please put another positive number: ") ;
        } else {
          IsValid = true;
        }
      } else {
        System.out.println("Value isn't valid, please enter a number: ") ;
        input.nextLine(); 
      }  
    }
      Multiplier = bankServiceFeeEstimator.determineMultiplier(NumberofChecks);
      bankServiceFeeEstimator.calculateBankServiceFee(NumberofChecks, BaseChargePerMonth, Multiplier);  
      input.close();
  }
}
