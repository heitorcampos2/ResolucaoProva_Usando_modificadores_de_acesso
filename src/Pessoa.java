/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HeiThor
 */
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
        System.out.println("Nome: "+this.getNome());
        System.out.println("Data de nascimento: ");
        this.getDataDeNascimento().MostrarData();
    }
    /////////////////////////////////////
}
