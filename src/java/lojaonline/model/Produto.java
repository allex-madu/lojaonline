package lojaonline.model;
import java.io.Serializable;
/**
 * @author Allex
 */
public class Produto  implements Serializable
{
    private int idProduto;
    private int codigoProduto;
    private String nomeProduto;
    private double precoProduto;

    public Produto() {
    }

    public Produto(int idProduto, int codigoProduto, String nomeProduto, double precoProduto) {
        this.idProduto = idProduto;
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
    public int getIdProduto(){
        return idProduto;
    }
    
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    
    public int getCodigoProduto(){
        return codigoProduto;
    }
    
    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    public String getNomeProduto(){
        return nomeProduto;
    }
    
    public void setNome(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public double getPrecoProduto(){
        return precoProduto;
    } 
    
    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.idProduto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }   

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + '}';
    }  
}
