/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Complex {
    private double real = 0;
    private double imaginer = 0;
    
    public Complex()
    {
        
    }
    public Complex(double real, double imaginer)
    {
        this.real = real;
        this.imaginer = imaginer;
        
    }
    public Complex(Complex other)
    {
        this.real = other.real;
        this.imaginer = other.imaginer;
    }

    
    public void setReal(double real) {
        
        this.real = real;
    }

    public void setImaginer(double imaginer) {
        this.imaginer = imaginer;
    }
    
    
    public double getReal() {
        return real;
    }

    public double getImaginer() {
        return imaginer;
    }
    public void add(Complex other)
    {
        real = this.real + other.real;
        imaginer = this.imaginer + other.imaginer;
    }
    public void sub(Complex other)
    {
        real = this.real - other.real;
        imaginer = this.imaginer - other.imaginer;
    }
    public void mul(Complex other)
    {
        double Reall = ((this.real * other.real) - 
        	(this.imaginer * other.imaginer));
        
        double Imaginerr = ((this.real * other.imaginer) + 
        	(this.imaginer * other.real));
        
        real = Reall;
        imaginer = Imaginerr;
    }
    public void div(Complex other)
    {
        double bagi = ( (other.real * other.real) +
                (other.imaginer * other.imaginer) );
        
        if(bagi == 0)
        {
            real = Double.POSITIVE_INFINITY;
            imaginer = Double.POSITIVE_INFINITY;
        }
        
        else
        {
            double reall = ( (this.real * other.real) +
                    (this.imaginer * other.imaginer) )  /
                    bagi;
            
            double imaginerr = ( (other.real * this.imaginer) -
                    (this.real * other.imaginer)) / bagi;
            
            real = reall;
            imaginer = imaginerr;
        }
    }
    public int compareTo(Complex other)
    {
        double magnitude1 = Math.sqrt(this.real * this.real + 
                                      this.imaginer * this.imaginer);
        
        double magnitude2 = Math.sqrt(other.real * other.real + 
                                      other.imaginer * other.imaginer);
        
        if (magnitude1 == magnitude2)
        {
            return 0;
        }
        else if(magnitude1 > magnitude2)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
