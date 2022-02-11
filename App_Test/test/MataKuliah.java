/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MataKuliah {
    //deklarasi
    
    private String nama;
    private double nilaiUts1 = 0.0;
    private double nilaiUts2 = 0.0;
    private int sks;
    private double nilaiUas = 0.0;
    private double nilaiAngka;
    private final double Uts1 = 0.3;
    private final double Uts2 = 0.3;
    private final double Uas = 0.4;

    public MataKuliah()
    {
        
    }
    
    public MataKuliah(String nm, int s)
    {
        nama = nm;
        sks = s;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        nama = n;
    }

    public double getNilaiUts1() {
        return nilaiUts1;
    }

    public void setNilaiUts1(double uts1) {
        if(uts1 < 0 || uts1 > 100)
            nilaiUts1 = 0;
        else
            nilaiUts1 = uts1;
    }

    public double getNilaiUts2() {
        return nilaiUts2;
    }

    public void setNilaiUts2(double uts2) {
        if(uts2 < 0 || uts2 > 100)
            nilaiUts2= 0;
        else
            nilaiUts2 = uts2;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int s) {
        sks = s;
    }
    public double getNilaiUas()
    {
        return nilaiUas;
    }
    public void setNilaiUas(double uas)
    {
        if(uas < 0 || uas > 100)
            nilaiUas = 0;
        else
            nilaiUas = uas;
    }
    
    public double getNilaiAngka()
    {
        return nilaiAngka = ((nilaiUts1 * Uts1)+(nilaiUts2 * Uts2)+(nilaiUas * Uas));
        
    }
    
    public char getNilaiHuruf()
    {
        if (getNilaiAngka() >= 80){
            return ('A');
        }
        else if(getNilaiAngka() >= 70 && getNilaiAngka() < 80){
            return('B');
        }
        else if (getNilaiAngka() >= 56 &&  getNilaiAngka() < 70){
            return('C');
        }
        else if(getNilaiAngka() >= 50 && getNilaiAngka() < 56){
            return('D');
        }
        else{
            return('E');
        }
        
    }
    public boolean isRemidi()
    {
        boolean test1 = false;
        if((nilaiAngka < 70 && nilaiUts1 == 0) ||
                (nilaiUts2 == 0) ||
                       (nilaiUas == 0))
        {
             test1 = true;
        }        
        if(nilaiUts1 > 0 &&  nilaiUts2 == 0 && nilaiUas == 0){
            test1 = false;
        }
                
        if(nilaiUts1 == 0 &&  nilaiUts2 == 0 && nilaiUas > 0){
            test1 = false;
        } 
        if(nilaiUts1 == 0 &&  nilaiUts2 == 0 && nilaiUas == 0){
            test1 = false;
        }
        return test1;
    }
}
