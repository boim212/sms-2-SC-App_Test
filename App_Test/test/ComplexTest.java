/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class ComplexTest {
    
    public ComplexTest() {}
    
    @Test
    public void testCompareTo1() {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(c1);
        assertEquals(0, c1.compareTo(c2), 0);        
    }
    
    @Test
    public void testCompareTo2() {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(4, 3);
        assertEquals(0, c1.compareTo(c2), 0);        
    }
    
    @Test
    public void testCompareTo3() {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(0, 1);
        assertEquals(-1, c1.compareTo(c2), 0);        
    }
    
    @Test
    public void testCompareTo4() {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(-1, 0);
        assertEquals(-1, c1.compareTo(c2), 0);        
    }

    @Test
    public void testCompareTo5() {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(0, 0);
        assertEquals(1, c1.compareTo(c2), 0);        
    }
    
    @Test
    public void testCompareTo6() {
        Complex c1 = new Complex(-1, -1);
        Complex c2 = new Complex(0, 0);
        assertEquals(1, c1.compareTo(c2), 0);        
    }

    @Test
    public void testAdd() {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(-1.2, -1.7);
        c1.add(c2);
        assertEquals(-1.2, c1.getReal(), 0);        
        assertEquals(-1.7, c1.getImaginer(), 0);        
    }

    @Test
    public void testSub() {
        Complex c1 = new Complex(0, 0);
        Complex c2 = new Complex(1.2, 1.7);
        c1.sub(c2);
        assertEquals(-1.2, c1.getReal(), 0);        
        assertEquals(-1.7, c1.getImaginer(), 0);        
    }

    @Test
    public void testMul() {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);
        c1.mul(c2);
        assertEquals(23, c1.getReal(), 0);        
        assertEquals(2, c1.getImaginer(), 0);        
    }

    @Test
    public void testDiv1() {
        Complex c1 = new Complex(4, 12);
        Complex c2 = new Complex(8, 0);
        c1.div(c2);
        assertEquals(0.5, c1.getReal(), 0);        
        assertEquals(1.5, c1.getImaginer(), 0);        
    }

    @Test
    public void testDiv2() {
        Complex c1 = new Complex(4, 12);
        Complex c2 = new Complex(0, 8);
        c1.div(c2);
        assertEquals(1.5, c1.getReal(), 0);        
        assertEquals(-0.5, c1.getImaginer(), 0);        
    }

    @Test
    public void testDiv3() {
        Complex c1 = new Complex(4, 12);
        Complex c2 = new Complex(8, -8);
        c1.div(c2);
        assertEquals(-0.5, c1.getReal(), 0);        
        assertEquals(1, c1.getImaginer(), 0);        
    }

    @Test
    public void testDiv4() {
        Complex c1 = new Complex(4, 12);
        Complex c2 = new Complex(0, 0);
        c1.div(c2);
        assertEquals(Double.POSITIVE_INFINITY, c1.getReal(), 0);        
        assertEquals(Double.POSITIVE_INFINITY, c1.getImaginer(), 0);        
    }
    
}
