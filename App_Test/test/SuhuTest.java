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
public class SuhuTest {
    
    public SuhuTest() {
    }
    
    @Test
    public void testConstructor() {
        Suhu o = new Suhu();
        double expResult = 0.0;
        double result = o.getKelvin();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testConstructorParameter() {
        Suhu o = new Suhu(100);
        double expResult = 100.0;
        double result = o.getKelvin();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testConstructorParameterNotValid() {
        Suhu o = new Suhu(-100);
        double expResult = 0;
        double result = o.getKelvin();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSetKelvin(){
        Suhu o = new Suhu();
        o.setKelvin(100.5);
        double expResult = 100.5;
        double result = o.getKelvin();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSetKelvinNotValid(){
        Suhu o = new Suhu();
        o.setKelvin(-3);
        assertEquals(0.0, o.getKelvin(), 0.0);
    }
    
    @Test
    public void testGetCelcius(){
        Suhu o = new Suhu();
        assertEquals(-273.15, o.getCelcius(), 0.01);
    }
    
    @Test
    public void testSetCelcius(){
        Suhu o = new Suhu();
        o.setCelcius(100);
        assertEquals(373.15, o.getKelvin(), 0.01);
    }
    
    @Test
    public void testSetCelciusNotValid(){
        Suhu o = new Suhu();
        o.setCelcius(-300);
        assertEquals(0.0, o.getKelvin(), 0.0);
    }
    
    @Test
    public void testFahrenheit(){
        Suhu o = new Suhu();
        assertEquals(-459.67, o.getFahrenheit(), 0.01);
    }
    
    @Test
    public void testSetFahrenheit(){
        Suhu o = new Suhu();
        o.setFahrenheit(99.5);
        assertEquals(310.65, o.getKelvin(), 0.01);
    }
    
    @Test
    public void testSetFahrenheitNotValid(){
        Suhu o = new Suhu();
        o.setFahrenheit(-500);
        assertEquals(0.0, o.getKelvin(), 0.0);
    }
    
    @Test
    public void testGetReamur(){
        Suhu o = new Suhu();
        assertEquals(-218.52, o.getReamur(), 0.01);
    }
    
    @Test
    public void testSetReamur(){
        Suhu o = new Suhu();
        o.setReamur(100);
        assertEquals(398.15, o.getKelvin(), 0.01);
    }
    
    @Test
    public void testSetReamurNotValid(){
        Suhu o = new Suhu();
        o.setReamur(-300);
        assertEquals(0.0, o.getKelvin(), 0.0);
    }
    
    @Test
    public void testGetInfo1(){
        Suhu o = new Suhu();
        assertEquals("Suhu{kelvin=0.0}", o.getInfo());
    }

    @Test
    public void testGetInfo2(){
        Suhu o = new Suhu(127.05);
        assertEquals("Suhu{kelvin=127.05}", o.getInfo());
    }
}
