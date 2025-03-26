package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa>tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de tarefas:" + listaTarefas.obterNumeroTotalTarefa());
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas:" + listaTarefas.obterNumeroTotalTarefa());
        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas:" + listaTarefas.obterNumeroTotalTarefa());
        listaTarefas.obterDescricaoTarefa();
    }

}
