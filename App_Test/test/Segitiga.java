/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private double SisiA = 1.0;
    private double SisiB = 1.0;
    private double SisiC = 1.0;
   
    
    public Segitiga()
    {
        
    }
    
    public double getSisiA()
    {
        if (SisiA < 0 )
            SisiA = 0;
        else if(SisiA == 0 || SisiA == 3)
            SisiA = 1.0;
        
        return SisiA;
    }
    public double getSisiB()
    {
        if (SisiB < 0)
            SisiB = 0;
        else if(SisiB == 0 || SisiB == 3)
            SisiB = 1.0;
        return SisiB;
    }
    public double getSisiC()
    {
        if (SisiC < 0)
            SisiC = 0;
        else if(SisiC == 0 || SisiC == 3)
            SisiC = 1.0;
        return SisiC;
    }
    public Segitiga(double a, double b, double c)
    {
        if (isValid (a,b,c))
        {
            SisiA = a;
            SisiB = b;
            SisiC = c; 
        }
            
    }
    public void setSisiA(double a)
    {
        if(a < 0)
            SisiA = 1.0;
        else
            SisiA = a;
    }
    
    public void setSisiB(double b)
    {
        if(b < 0)
            SisiB = 1.0;
        else
            SisiB = b;
    }
    
    public void setSisiC(double c)
    {
        if(c < 0)
            SisiC = 1.0;
        else
            SisiC = c;
    }
    
    public double getKeliling()
    {
        return (getSisiA() + getSisiB() + getSisiC());
    }
    
    public double getLuas()
    {
        double s = (0.5 * (SisiA + SisiB + SisiC)); 
        return (Math.sqrt(s * (s - SisiA)*(s - SisiB)*(s - SisiC) ));
    }
    public String getInfo()
    {
        
        return "Segitiga{sisiA="+SisiA+", sisiB="+SisiB+", sisiC="+SisiC+"}";
    }
    public boolean isSamaSisi()
    {
        if (SisiA == SisiB && SisiA == SisiC ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isSamaKaki()
    {
        if( SisiA == SisiB || SisiA == SisiC || SisiB == SisiC )
        {
        return true;
        }
        else 
            return false;
    }
    private boolean isValid(double a, double b, double c)
    {
        boolean test1 = false;
        boolean test2 = false;
        
        if((a > 0) && (b > 0) && (c > 0)){
            test1 = true;
        }
        else if (a < 0){
            SisiB = b;
            SisiC = c;
        }
        else if (b < 0){
            SisiA = a;
            SisiC = c;
        }
        else if(c < 0){
            SisiA = a;
            SisiB = b;
        }
        else
           return test1 = false; 
        if (a > b && a > c && a < b +c)
            test2 = true;
        else if (b > a && b > c && b < a + c)
            test2 = true;
        else if (c > a && c > b && c < a + b)
            test2 = true;
        else if (a == b && a == c)
            test2 = true;
        else
            test2 = false;
        return test1 && test2;
    }
    public Segitiga(Segitiga other)
    {
        this(other.SisiA,other.SisiB,other.SisiC);
    }
    public boolean isKongruen(Segitiga other)
    {
        if ((this.SisiA == other.SisiA) &&
                (this.SisiB == other.SisiB) &&
                (this.SisiC == other.SisiC))
        {
            return true;
        }
        else if((this.SisiA == other.SisiC) &&
                (this.SisiB == other.SisiA) &&
                (this.SisiC == other.SisiB))
        {
            return true;
        }
        else if((this.SisiA == other.SisiC) &&
                (this.SisiB == other.SisiB) &&
                (this.SisiC == other.SisiA))
        {
            return true;
        }
        else if((this.SisiA == other.SisiA) &&
                (this.SisiB == other.SisiC) &&
                (this.SisiC == other.SisiB))
        {
            return true;
        }
        else{
            return false;
        }
//        double temp;
//        do {
//                if (this.SisiA > this.SisiA){
//                    temp = this.SisiA;
//                    this.SisiA = this.SisiB;
//                    this.SisiB = temp;
//                }
//                else if (this.SisiB > this.SisiC){
//                    temp = this.SisiB;
//                    this.SisiB = this.SisiC;
//                    this.SisiC = temp;
//                }
//                else if (other.SisiA > other.SisiA){
//                    temp = other.SisiA;
//                    other.SisiA = other.SisiB;
//                    other.SisiB = temp;
//                }
//                else if (other.SisiB > other.SisiC){
//                    temp = other.SisiB;
//                    other.SisiB = other.SisiC;
//                    other.SisiC = temp;
//                }
//        }while(this.SisiA > this.SisiB || this.SisiB > this.SisiC || other.SisiA > other.SisiB || other.SisiB > other.SisiC);
//       
//        if ( (this.SisiA == other.SisiB) && (this.SisiB == other.SisiB) && (this.SisiC == other.SisiC) )
//        {
//           return true; 
//        }
//        else{
//            return false;
//        }
    }
}
