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
public class MataKuliahTest {
    
    public MataKuliahTest() {
    }

    @Test
    public void testConstructor() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        assertEquals("PBO 1", o.getNama());
        assertEquals(3, o.getSks());
    }
    
    @Test
    public void testSetUts1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(75.5);
        assertEquals(75.5, o.getNilaiUts1(), 0.0);
    }

    @Test
    public void testSetUts1NotValid1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(101);
        assertEquals(0, o.getNilaiUts1(), 0.0);
    }

    @Test
    public void testSetUts1NotValid2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(-1);
        assertEquals(0, o.getNilaiUts1(), 0.0);
    }

    @Test
    public void testSetUts2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts2(75.5);
        assertEquals(75.5, o.getNilaiUts2(), 0.0);
    }

    @Test
    public void testSetUts2NotValid1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts2(101);
        assertEquals(0, o.getNilaiUts2(), 0.0);
    }

    @Test
    public void testSetUts2NotValid2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts2(-1);
        assertEquals(0, o.getNilaiUts2(), 0.0);
    }

    @Test
    public void testSetUas() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUas(75.5);
        assertEquals(75.5, o.getNilaiUas(), 0.0);
    }

    @Test
    public void testSetUasNotValid1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUas(101);
        assertEquals(0, o.getNilaiUas(), 0.0);
    }

    @Test
    public void testSetUasNotValid2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUas(-1);
        assertEquals(0, o.getNilaiUas(), 0.0);
    }

    @Test
    public void testGetNilaiAngka() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(10);
        o.setNilaiUts2(20);
        o.setNilaiUas(30);
        assertEquals(21, o.getNilaiAngka(), 0.0);
    }

    @Test
    public void testGetNilaihurufA() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(80);
        o.setNilaiUts2(80);
        o.setNilaiUas(80);
        assertEquals('A', o.getNilaiHuruf());
    }

    @Test
    public void testGetNilaihurufB() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(70);
        o.setNilaiUts2(70);
        o.setNilaiUas(70);
        assertEquals('B', o.getNilaiHuruf());
    }
    
    @Test
    public void testGetNilaihurufC() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(56);
        o.setNilaiUts2(56);
        o.setNilaiUas(56);
        assertEquals('C', o.getNilaiHuruf());
    }
    
    @Test
    public void testGetNilaihurufD() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(50);
        o.setNilaiUts2(50);
        o.setNilaiUas(50);
        assertEquals('D', o.getNilaiHuruf());
    }

    @Test
    public void testGetNilaihurufE() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(50);
        o.setNilaiUts2(50);
        o.setNilaiUas(49);
        assertEquals('E', o.getNilaiHuruf());
    }

    @Test
    public void testIsRemidiTrue1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts2(100);
        o.setNilaiUas(99);
        assertTrue(o.isRemidi());
    }

    @Test
    public void testIsRemidiTrue2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(100);
        o.setNilaiUas(99);
        assertTrue(o.isRemidi());
    }

    @Test
    public void testIsRemidiTrue3() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(100);
        o.setNilaiUts2(100);
        assertTrue(o.isRemidi());
    }
    
    @Test
    public void testIsRemidiFalse1() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(100);
        assertFalse(o.isRemidi());
    }

    @Test
    public void testIsRemidiFalse2() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUas(100);
        assertFalse(o.isRemidi());
    }

    @Test
    public void testIsRemidiFalse3() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        assertFalse(o.isRemidi());
    }

    @Test
    public void testIsRemidiFalse4() {
        MataKuliah o = new MataKuliah("PBO 1", 3);
        o.setNilaiUts1(90);
        o.setNilaiUts2(80);
        o.setNilaiUas(100);
        assertFalse(o.isRemidi());
    }
    
    @Test
    public void testSomeMethod() {
    }
    
}
