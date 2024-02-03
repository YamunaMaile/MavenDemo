package com.testRun;



import org.testng.annotations.Test;

import com.pages.printHi;

/**
 * Unit test for simple App.
 */
public class testPrintHi 
{
   
   @Test
   
    public void printHiMessage()
    {
    	printHi hi=new printHi();
    	hi.print();
       // assert.equals(log.PAS)
    }
}
