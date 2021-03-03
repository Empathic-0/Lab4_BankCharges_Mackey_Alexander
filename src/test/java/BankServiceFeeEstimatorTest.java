/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexander
 */
public class BankServiceFeeEstimatorTest {
    
    public BankServiceFeeEstimatorTest() {
    }

    @Test
    public void testDetermineMultiplier() {
        System.out.println("determineMultiplier");
        int NumberofChecks = 19;
        BankServiceFeeEstimator instance = new BankServiceFeeEstimator();
        double expResult = 0.10;
        double result = instance.determineMultiplier(NumberofChecks);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        
         NumberofChecks = 21;      
        expResult = 0.08;
        result = instance.determineMultiplier(NumberofChecks);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        
        NumberofChecks = 41;      
        expResult = 0.06;
        result = instance.determineMultiplier(NumberofChecks);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        
        NumberofChecks = 61;      
        expResult = 0.04;
        result = instance.determineMultiplier(NumberofChecks);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculateBankServiceFee() {
        System.out.println("calculateBankServiceFee");
        int NumberofChecks = 19;
        int BaseChargePerMonth = 100;
        double Multiplier = 0.10;
        BankServiceFeeEstimator instance = new BankServiceFeeEstimator();
        instance.calculateBankServiceFee(NumberofChecks, BaseChargePerMonth, Multiplier);
        fail("The test case is a prototype.");
    }
    
}
