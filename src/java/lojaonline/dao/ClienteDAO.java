package lojaonline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lojaonline.db.util.ConnectionFactory;
import lojaonline.model.Cliente;

/**
 * @author Allex
 */
public class ClienteDAO {

    private static final String INSERIR = "INSERT INTO cliente(nome_cliente,sobrenome_cliente) VALUES (?, ?)";
    private static final String EDITAR = "UPDATE cliente SET nome_cliente = ?, sobrenome_cliente = ? WHERE id_cliente = ?";
    private static final String ELIMINAR = "DELETE FROM cliente WHERE id_cliente = ?";
    private static final String LISTAR_POR_CODIGO = "SELECT * FROM cliente WHERE id_cliente = ?";
    private static final String LISTAR_TUDO = "SELECT * FROM cliente";
    
    Connection conn;
    public ClienteDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public void guardar(Cliente cliente){
        try{
            PreparedStatement ps = conn.prepareStatement(INSERIR);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getSobrenomeCliente());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void editar(Cliente cliente){
        try{
            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getSobrenomeCliente());
            ps.setInt(3, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void eliminar(Cliente cliente){
        try{
            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }        
    } 
    
    public List<Cliente> listaTodos(){
        List<Cliente> clientes = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(LISTAR_TUDO);
            while(rs.next()){
                Cliente cliente = new Cliente();
                popularCliente(cliente, (ResultSet) rs);
                clientes.add(cliente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return clientes;    
    }
    
    public Cliente buscarPorId(int idCliente){
        Cliente cliente = new Cliente();
        try{
            PreparedStatement ps = conn.prepareStatement(LISTAR_POR_CODIGO);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                popularCliente(cliente, rs);
                
            }
            rs.close();           
        }catch(SQLException ex){
            ex.printStackTrace();        
        }
        return cliente;
    }

    private void popularCliente(Cliente cliente, ResultSet rs) {
       try{
           cliente.setIdCliente(rs.getInt("id_cliente"));
           cliente.setNomeCliente(rs.getString("nome_cliente"));
           cliente.setSobrenomeCliente(rs.getString("sobrenome_cliente"));
       }catch(SQLException ex){
           ex.printStackTrace();
       }     
    }
}
