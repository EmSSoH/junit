/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxtest;

import org.junit.Test;
import static org.junit.Assert.*;
import testJunit.TaxCalculator;

/**
 *
 * @author Magnus West Madsen
 */
public class TestTaxCalculator {
    
    public TestTaxCalculator() {
    }
    
    @Test
    public void TaxCalcTest(){
        TaxCalculator tester = new TaxCalculator();
        
        assertEquals(0, tester.Tax(0), 0);
        assertEquals(4620, tester.Tax(22000), 0);
        assertEquals(27900, tester.Tax(90000), 0);
        assertEquals(74000, tester.Tax(200000), 0);
        assertEquals(141900, tester.Tax(330000), 0);
        assertEquals(234000, tester.Tax(450000), 0);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
