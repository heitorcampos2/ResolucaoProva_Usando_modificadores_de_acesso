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
        Pessoa p = new Pessoa();
        p.setNome("Fulano");
        
        Data d = new Data();
        d.setDia(3);
        d.setMes(4);
        d.setAno(1997);
        p.setDataDeNascimento(d);
        
        Veiculo v = new Veiculo();
        v.setProprietario(p);
        
        Data d1 = new Data();
        d1.setDia(1);
        d1.setMes(2);
        d1.setAno(2019);
        v.setDataAquisicao(d1);
        /////////////////////////////////////
        p.MostrarPessoa();
        v.InformarFinalidade("Passeio");
        v.MostrarVeiculo();
        
    }

}
