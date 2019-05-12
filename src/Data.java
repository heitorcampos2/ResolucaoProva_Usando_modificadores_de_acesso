public class Data {
    private int dia;
    private int mes;
    private int ano;
    /////////////////////////////////////
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.dia;
    }
        
    public int getAno(){
        return this.dia;
    }
    /////////////////////////////////////
    public void setDia(int d){
        this.dia=d;
    }
    
    public void setMes(int m){
        this.dia=m;
    }
    
    public void setAno(int a){
        this.dia=a;
    }
    /////////////////////////////////////
    public void MostrarData(){
        System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAno());
    }
    /////////////////////////////////////
    
}
