package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Alunos removerAluno = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula().equals(matricula)) {
                    removerAluno = a;
                    break;
                }
            }
            alunosSet.remove(removerAluno);
        }else throw new RuntimeException("O conjunto está vazio!");
    }
    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorAlunos());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    public Set<Alunos> exibirAlunos(){
        return alunosSet;
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Todos os Alunos: "+gerenciadorAlunos.alunosSet);
        gerenciadorAlunos.removerAluno(123456);
        System.out.println("Todos os Alunos: "+gerenciadorAlunos.alunosSet);
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();


    }
}
