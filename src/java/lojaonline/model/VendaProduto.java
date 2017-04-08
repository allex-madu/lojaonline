package lojaonline.model;
import java.io.Serializable;
/**
 * @author Allex
 */
public class VendaProduto implements Serializable{

    private Venda venda;
    private Produto produto;
    private int quantidade;
    private double precoVenda;

    public VendaProduto() {
    }

    public VendaProduto(Venda venda, Produto produto, int quantidade, double precoVenda) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "VendaProduto{" + '}';
    }
}
