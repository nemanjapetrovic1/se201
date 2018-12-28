/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import se201.projekat.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nemanja
 */
public class PrviTest {

    public PrviTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testiranjeNovca() {
        
        Main m  = new Main();
        double val1 = 5;
        double val2 = 3;
        m.dovoljnoNovca(val1, val2);
        
        boolean tacno = false;
        if(val1>val2) {
        tacno = true;}
        boolean result = m.dovoljnoNovca(val1, val2);
        
        assertEquals(tacno, result);
        assertTrue(val1 > val2);
        assertNotNull(result);
     
    }
}
