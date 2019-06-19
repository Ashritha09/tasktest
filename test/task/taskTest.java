/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Ashritha
 */
public class taskTest { 
   
    
    @Test
    public void test() {
        task p=new task();
        assertEquals(“BCD”,p.t("ABCD"));
         assertEquals(“AACD”,p.t("CD"));
         assertEquals(“BACD”,p.t("BCD"));
          assertEquals(“BAA”,p.t("BBAA"));
          assertEquals(“AABAA”,p.t("BAA"));
        // TODO review the generated test code and remove the default call to fail.
    }

  }

  //junit testing 
    
       

    
   
    

   
   
    
    

