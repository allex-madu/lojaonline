package lojaonline.model;
import java.io.Serializable;
import java.util.Date;
/**
 * @author Allex
 */
public class Venda implements Serializable{

    private int idVenda;
    private Date dataVenda;
    private Cliente cliente;

    public Venda() {
    }

    public Venda(int idVenda, Date dataVenda, Cliente cliente) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idVenda;
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
        final Venda other = (Venda) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        return true;
    }
}


