package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String exibirPalavra = dicionarioMap.get(palavra);
        if (exibirPalavra != null){
            return exibirPalavra;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("boca", "parte da cabeça");
        dicionario.adicionarPalavra("casa", "lugar para morar");
        dicionario.adicionarPalavra("boca", "para beija");
        dicionario.adicionarPalavra("avião", "para viajar");
        dicionario.adicionarPalavra("jardim", "local de lazer");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("avião");
        dicionario.exibirPalavras();

        String definicaoBoca = dicionario.pesquisarPorPalavra("boca");
        System.out.println("Definiçãode boca é: " + definicaoBoca);

        String definicaoJardim = dicionario.pesquisarPorPalavra("jardim");
        System.out.println("Definiçãode jardim é: " + definicaoJardim);

        dicionario.removerPalavra("boca");
        dicionario.exibirPalavras();


    }
}
