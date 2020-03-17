package jddJunit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * AABC => BC;
     * ABCD => BCD;
     * BACD => BCD;
     * BBAA => BBAA;
     * A => " ";
     * "" => "";
     * B => "B";
     */
    @Test
    public void FirstLetterA()
    {
        RemovingA removingA = new RemovingA();
        assertEquals("BCD",removingA.check("ABCD"));
    }
    @Test
    public void BothLetterA(){
        RemovingA removingA = new RemovingA();
        assertEquals("BC",removingA.check("AABC"));
    }
    @Test
    public void SECOndLetterA(){
        RemovingA removingA = new RemovingA();
        assertEquals("BCD",removingA.check("BACD"));
    }
    @Test
    public void NoLetterA(){
        RemovingA removingA = new RemovingA();
        assertEquals("BBAA",removingA.check("BBAA"));
    }
    @Test
    public void SingleLetterA(){
        RemovingA removingA = new RemovingA();
        assertEquals(" ",removingA.check("A"));
    }
    @Test
    public void SomEOtherSingleLetter(){
        RemovingA removingA = new RemovingA();
        assertEquals("B",removingA.check("B"));
    }
    @Test
    public void Empty(){
        RemovingA removingA = new RemovingA();
        assertEquals(" ",removingA.check(""));
    }
}
