public class Pessoa {
    private Data dataDeNascimento;
    private String nome;
    /////////////////////////////////////
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public String getNome(){
        return this.nome;
    }
    /////////////////////////////////////
    public void setNome(String n){
        this.nome=n;
    }
    
    public void setDataDeNascimento(Data d){
        this.dataDeNascimento = d;
    }
    /////////////////////////////////////
    public void MostrarPessoa(){
        System.out.println("Pessoa: "+this.getNome());
        System.out.println("Data de nascimento: ");
        this.getDataDeNascimento().MostrarData();
    }
    /////////////////////////////////////
}
