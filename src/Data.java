/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HeiThor
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    /////////////////////////////////////
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
        
    public int getAno(){
        return this.ano;
    }
    /////////////////////////////////////
    public void setDia(int d){
        this.dia=d;
    }
    
    public void setMes(int m){
        this.mes=m;
    }
    
    public void setAno(int a){
        this.ano=a;
    }
    /////////////////////////////////////
    public void MostrarData(){
        System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAno());
    }
    /////////////////////////////////////
    
}
