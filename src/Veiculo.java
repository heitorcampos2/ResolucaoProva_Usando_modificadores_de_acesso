public class Veiculo {
    private Data dataAquisicao;
    private Pessoa proprietario;
    private String finalidade;
    
    public Data getDtaAquisicao(){
        return this.dataAquisicao;        
    }

    public Pessoa getProprietario(){
        return this.proprietario;        
    }    

    public String getFinalidade(){
        return this.finalidade;        
    }    
    
    public void MostrarVeiculo(){
        System.out.println("Proprietário do Veículo");
        this.getProprietario().MostrarPessoa();
        
        System.out.println("Data de aquisição: ");
        this.getDtaAquisicao().mostrarData();
        
        
    }
    
    
}
