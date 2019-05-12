/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HeiThor
 */
public class Teste {
    public static void main(String[] args){
        /////////////////////////////////////
        Pessoa p1 = new Pessoa();
        p1.setNome("Fulano");
        
        Data p01 = new Data();
        p01.getDia(05);
        p01.getMes(08);
        p01.getAno(1997);
        p1.setDataDeNascimento(p01);
        /////////////////////////////////////
        Veiculo l = new Veiculo();
        l.setProprietario(p1);
        
        Data da = new Data();
        da.getDia(01);
        da.getMes(02);
        da.getAno(2019);
        l.getDtaAquisicao(da);
        /////////////////////////////////////
        p1.MostrarPessoa();
        l.InformarFinalidade("Passeio");
        l.MostrarVeiculo();
        
    }
}
