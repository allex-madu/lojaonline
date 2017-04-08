package lojaonline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lojaonline.db.util.ConnectionFactory;
import lojaonline.model.Cliente;

/**
 * @author Allex
 */
public class ClienteDAO {

    private static final String INSERIR = "INSERT INTO cliente (nome_cliente,sobrenome_cliente) VALUES (?, ?)";
    private static final String EDITAR = "UPDATE cliente SET nome_cliente = ?, sobrenome_cliente = ? WHERE id_cliente = ?";
    private static final String ELIMINAR = "DELETE FROM cliente WHERE id_cliente = ?";
    private static final String LISTAR_POR_CODIGO = "SELECT * FROM cliente WHERE id_cliente = ?";
    private static final String lISTAR_TUDO = "SELECT * FROM cliente";
    
    Connection conn;
    public ClienteDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public void guardar(Cliente cliente){
        try{
            PreparedStatement ps = conn.prepareStatement(INSERIR);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(1, cliente.getSobrenomeCliente());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

    
}
