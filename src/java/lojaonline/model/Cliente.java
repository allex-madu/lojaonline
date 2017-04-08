package lojaonline.model;
import java.io.Serializable;
/**
 * @author Allex
 */
public class Cliente implements Serializable{
    
    private int idCliente;
    private String nomeCliente;
    private String sobrenomeCliente;
    
    public Cliente(int idCliente, String nomeCliente, String sobrenomeCliente){
        this.idCliente        = idCliente;
        this.nomeCliente      = nomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
    }
    
    public Cliente(){
    }
    
    //Geters
    public int getIdCliente(){
        return idCliente;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public String getSobrenomeCliente(){
        return sobrenomeCliente;
    }
    
    //Seters
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public void setSobrenomeCliente(String sobrenomeCliente){
        this.sobrenomeCliente = sobrenomeCliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idCliente;
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + '}';
    }
}
