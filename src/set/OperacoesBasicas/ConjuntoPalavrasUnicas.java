package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()){
            if (palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            }else System.out.println("Palavra não encontrada no conjunto!");
        }else  System.out.println("O conjunto está vazio!");
    }

    public void verificarPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()){
            if (palavrasUnicas.contains(palavra)){
                System.out.println("Encontrada a palavra: "+palavra);
            }else System.out.println("Palavra não encontrada no conjunto!");
        }else System.out.println("O conjunto está vazio!");
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        }else System.out.println("O conjunto está vazio!");
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicas +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Faca");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
