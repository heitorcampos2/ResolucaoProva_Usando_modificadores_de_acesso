/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HeiThor
 */
public class Retangulo {
    private int b;
    private int h;
    /////////////////////////////////////
    public int getB(){
        return b;
    }
    
    public int getH(){
        return h;
    }
    /////////////////////////////////////
    public void setB(int b){
        this.b = b;
    }
    
    public void seth(int h){
        this.h = h;
    }
    /////////////////////////////////////
    double CalcularArea(int a){
        a = b*h;
        return a;
    }
    /////////////////////////////////////
}
