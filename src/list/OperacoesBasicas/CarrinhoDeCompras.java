package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int quantidade) {
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item i : carrinhoDeCompra){
            if (i.getNome().equals(nome)){
                carrinhoDeCompra.remove(i);
            }
        }
    }
    public void calcularValorTotal(){
        for (Item total:carrinhoDeCompra){

        }
    }
}
