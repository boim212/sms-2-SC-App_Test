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
public class SegitigaTest {
    
    public SegitigaTest() {
    }
    
        @Test
    public void testIsKongruenTrue1(){
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga(s1);
        assertTrue(s1.isKongruen(s2));
    }
    
    @Test
    public void testIsKongruenTrue2(){
        Segitiga s1 = new Segitiga(3, 4, 5);
        Segitiga s2 = new Segitiga(4, 5, 3);
        assertTrue(s1.isKongruen(s2));
    }
    
    @Test
    public void testIsKongruenTrue3(){
        Segitiga s1 = new Segitiga(3, 4, 5);
        Segitiga s2 = new Segitiga(5, 4, 3);
        assertTrue(s1.isKongruen(s2));
    }

    @Test
    public void testIsKongruenTrue4(){
        Segitiga s1 = new Segitiga(3, 4, 5);
        Segitiga s2 = new Segitiga(3, 5, 4);
        assertTrue(s1.isKongruen(s2));
    }
    
    @Test
    public void testIsKongruenFalse(){
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga(3, 5, 4);
        assertFalse(s1.isKongruen(s2));
    }

    
    @Test
    public void testConstructor() {
        Segitiga o = new Segitiga();
        assertEquals(1.0, o.getSisiA(), 0.0);
        assertEquals(1.0, o.getSisiB(), 0.0);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }
    
    @Test
    public void testConstructorParameter() {
        Segitiga o = new Segitiga(2.5, 2.5, 2.5);
        assertEquals(2.5, o.getSisiA(), 0.0);
        assertEquals(2.5, o.getSisiB(), 0.0);
        assertEquals(2.5, o.getSisiC(), 0.0);
    }

    @Test
    public void testConstructorParamaterNegatifA() {
        Segitiga o = new Segitiga(-2.5, 2.5, 2.5);
        assertEquals(1.0, o.getSisiA(), 0.0);
        assertEquals(2.5, o.getSisiB(), 0.0);
        assertEquals(2.5, o.getSisiC(), 0.0);
    }

    @Test
    public void testConstructorParamaterNegatifB() {
        Segitiga o = new Segitiga(2.5, -2.5, 2.5);
        assertEquals(2.5, o.getSisiA(), 0.0);
        assertEquals(1.0, o.getSisiB(), 0.0);
        assertEquals(2.5, o.getSisiC(), 0.0);
    }

    @Test
    public void testConstructorParamaterNegatifC() {
        Segitiga o = new Segitiga(2.5, 2.5, -2.5);
        assertEquals(2.5, o.getSisiA(), 0.0);
        assertEquals(2.5, o.getSisiB(), 0.0);
        assertEquals(1.0, o.getSisiC(), 0.0);
 
    }
    
    @Test
    public void testConstructorParamaterBukanSegitigaA() {
        Segitiga o = new Segitiga(6, 3, 2);
        assertEquals(1.0, o.getSisiA(), 0.0);
        assertEquals(1.0, o.getSisiB(), 0.0);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }

    @Test
    public void testConstructorParamaterBukanSegitigaB() {
        Segitiga o = new Segitiga(3, 6, 2);
        assertEquals(1.0, o.getSisiA(), 0.0);
        assertEquals(1.0, o.getSisiB(), 0.0);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }
    
    @Test
    public void testConstructorParamaterBukanSegitigaC() {
        Segitiga o = new Segitiga(2, 3, 6);
        assertEquals(1.0, o.getSisiA(), 0.0);
        assertEquals(1.0, o.getSisiB(), 0.0);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }

    @Test
    public void testSetSisiA() {
        Segitiga o = new Segitiga();
        o.setSisiA(1.1);
        assertEquals(1.1, o.getSisiA(), 0.0);
    }
    
    @Test
    public void testSetNegatifSisiA() {
        Segitiga o = new Segitiga();
        o.setSisiA(-1.1);
        assertEquals(1.0, o.getSisiA(), 0.0);
    }

    @Test
    public void testSetNolSisiA() {
        Segitiga o = new Segitiga();
        o.setSisiA(0);
        assertEquals(1.0, o.getSisiA(), 0.0);
    }
    @Test
    public void testBukanSegitigaSetSisiA() {
        Segitiga o = new Segitiga();
        o.setSisiA(3);
        assertEquals(1.0, o.getSisiA(), 0.0);
    }

    @Test
    public void testSetSisiB() {
        Segitiga o = new Segitiga();
        o.setSisiB(1.1);
        assertEquals(1.1, o.getSisiB(), 0.0);
    }
    
    @Test
    public void testSetNegatifSisiB() {
        Segitiga o = new Segitiga();
        o.setSisiB(-1.1);
        assertEquals(1.0, o.getSisiB(), 0.0);
    }

    @Test
    public void testSetNolSisiB() {
        Segitiga o = new Segitiga();
        o.setSisiB(0);
        assertEquals(1.0, o.getSisiB(), 0.0);
    }

    @Test
    public void testBukanSegitigaSetSisiB() {
        Segitiga o = new Segitiga();
        o.setSisiB(3);
        assertEquals(1.0, o.getSisiB(), 0.0);
    }
    
    @Test
    public void testSetSisiC() {
        Segitiga o = new Segitiga();
        o.setSisiC(1.1);
        assertEquals(1.1, o.getSisiC(), 0.0);
    }
    
    @Test
    public void testSetNegatifSisiC() {
        Segitiga o = new Segitiga();
        o.setSisiC(-1.1);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }

    @Test
    public void testSetNolSisiC() {
        Segitiga o = new Segitiga();
        o.setSisiC(0);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }

    @Test
    public void testBukanSegitigaSetSisiC() {
        Segitiga o = new Segitiga();
        o.setSisiC(3);
        assertEquals(1.0, o.getSisiC(), 0.0);
    }

    @Test
    public void testGetKeliling() {
        Segitiga o = new Segitiga();
        assertEquals(3.0, o.getKeliling(), 0.0);
    }

    @Test
    public void testGetLuas() {
        Segitiga o = new Segitiga(3, 4, 5);
        assertEquals(6.0, o.getLuas(), 0.0);
    }

    @Test
    public void testIsSamaSisiTrue() {
        Segitiga o = new Segitiga();
        assertTrue(o.isSamaSisi());
    }
    
    @Test
    public void testIsSamaSisiFalse() {
        Segitiga o = new Segitiga();
        o.setSisiA(1.1);
        assertFalse(o.isSamaSisi());
    }

    @Test
    public void testIsSamaKakiA() {
        Segitiga o = new Segitiga();
        o.setSisiA(1.1);
        assertTrue(o.isSamaKaki());
    }

    @Test
    public void testIsSamaKakiB() {
        Segitiga o = new Segitiga();
        o.setSisiB(1.1);
        assertTrue(o.isSamaKaki());
    }

    @Test
    public void testIsSamaKakiC() {
        Segitiga o = new Segitiga();
        o.setSisiC(1.1);
        assertTrue(o.isSamaKaki());
    }

    @Test
    public void testIsSamaKakiFalse() {
        Segitiga o = new Segitiga(3, 4, 5);
        assertFalse(o.isSamaKaki());
    }
    
    @Test
    public void testGetInfo1() {
        Segitiga o = new Segitiga();
        String expResult = "Segitiga{sisiA=1.0, sisiB=1.0, sisiC=1.0}";
        String result = o.getInfo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInfo2() {
        Segitiga o = new Segitiga(3, 4, 5);
        String expResult = "Segitiga{sisiA=3.0, sisiB=4.0, sisiC=5.0}";
        String result = o.getInfo();
        assertEquals(expResult, result);
    }
}
