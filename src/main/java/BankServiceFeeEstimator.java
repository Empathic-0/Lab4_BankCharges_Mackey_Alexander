/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class BankServiceFeeEstimator{
  public double determineMultiplier(int NumberofChecks){
    double Multiplier = 0;
    if (NumberofChecks <20) {
      Multiplier = .10;
      return Multiplier;
    } 
    if (NumberofChecks >=20 || NumberofChecks <=39) {
      Multiplier = .08;
      return Multiplier;
    } 
    if (NumberofChecks >=40 || NumberofChecks <=59) {
      Multiplier = .06;
      return Multiplier;
    } 
    if (NumberofChecks >=60) {
      Multiplier = .04;
      return Multiplier;            
    }
    return Multiplier;
  }
  
  public void calculateBankServiceFee(int NumberofChecks, int BaseChargePerMonth, double Multiplier) {
    double result = BaseChargePerMonth+(NumberofChecks*Multiplier);
    System.out.println("Your total bank service fees for the month: " + result);
  } 
}
