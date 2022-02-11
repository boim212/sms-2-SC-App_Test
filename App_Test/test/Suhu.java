/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Suhu {
    private double kelvin = 0.0;
    public Suhu (){
    }

    public Suhu (double kel){
        if (isValid(kel))
        kelvin = kel;
    }
    
    private boolean isValid(double k){
        if(k>=0)
            return true;
        else
            return false;
    }
    
    public double getKelvin(){
        return kelvin;
    }
    
    public void setKelvin(double k){
        if (isValid(k))
            kelvin = k;
    }
    
    public double getCelcius(){
        double c = kelvin - 273.15;
        return c;
    }
    
    public void setCelcius(double c){
        if(isValid(c))
            kelvin = c + 273.15;
            
    }
    
    public double getFahrenheit(){
        double f = (kelvin * 9/5) - 459.67;
        return f;
    }
    
    public void setFahrenheit(double f){
        if (isValid(f))
            kelvin = (f + 459.67)* 5/9;
    }

     public double getReamur(){
		 return (kelvin - 273.15) * 4/5;
    }
    
    public void setReamur(double r){
        if (isValid(r))
            kelvin = r * 5/4 + 273.15;
        
    }
    
    public String getInfo(){
        String i;
        double v = kelvin;
        if (isValid(v))
            i = "Suhu{kelvin=" + kelvin+ "}";
        else
            i = "Suhu{kelvin=" + kelvin+ "}";
        return i;
    }
}
