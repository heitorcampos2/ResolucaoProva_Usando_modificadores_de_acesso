/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HeiThor
 */
public class Veiculo {
    /////////////////////////////////////
    private Data dataAquisicao;
    private Pessoa proprietario;
    private String finalidade;
    /////////////////////////////////////
    public Data getDataAquisicao(){
        return this.dataAquisicao;        
    }

    public Pessoa getProprietario(){
        return this.proprietario;        
    }    

    public String getFinalidade(){
        return this.finalidade;        
    }
    /////////////////////////////////////
    public void setDataAquisicao(Data d){
        this.dataAquisicao=d;
    }
    
    public void setProprietario(Pessoa p){
        this.proprietario = p;                
    }
    
    public void setFinalidade(String f){
        this.finalidade = f;
    }
    /////////////////////////////////////
    public boolean InformarFinalidade(String f){
    this.finalidade = f;
    String outro;
    outro = "Passeio";
          if(this.finalidade.equals(outro)){
              System.out.println("Finalidade do veículo : " + this.finalidade);
               return true;
         }      
             return false;
    
    }
    /////////////////////////////////////
    public void MostrarVeiculo(){
        System.out.println("PROPRIETÁRIO E INFORMAÇÕES DO VEÍCULO\n=========================================");
        this.getProprietario().MostrarPessoa();
        
        System.out.println("Data de aquisição: ");
        this.getDataAquisicao().MostrarData();
     }
    /////////////////////////////////////
    
}
