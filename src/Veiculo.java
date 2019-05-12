public class Veiculo {
    private Data dataAquisicao;
    private Pessoa proprietario;
    private String finalidade;
    /////////////////////////////////////
    public Data getDtaAquisicao(){
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
        if((f == "Passeio")||(f == "Diplomacia")||(f == "Aluguel")){
            this.finalidade = f;
            return true;
        } else{
            return false;
        }
    }
    /////////////////////////////////////
    public void MostrarVeiculo(){
        System.out.println("Proprietário do Veículo");
        this.getProprietario().MostrarPessoa();
        
        System.out.println("Data de aquisição: ");
        this.getDtaAquisicao().MostrarData();
 
        System.out.println("Finalidade: ");
        this.getFinalidade(); 
    }
    /////////////////////////////////////
    
}
