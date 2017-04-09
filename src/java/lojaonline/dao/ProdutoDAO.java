package lojaonline.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lojaonline.db.util.ConnectionFactory;
import lojaonline.model.Produto;
/**
 * @author Allex
 */
public class ProdutoDAO {
    private static final String INSERIR = "INSERT INTO produto(codigo_produto, nome_produto, preco_produto) VALUES (?, ?, ?)";
    private static final String EDITAR = "UPDATE produto SET codigo_produto = ?, nome_produto = ?, preco_produto = ? WHERE id_produto = ?";
    private static final String ELIMINAR = "DELETE FROM produto WHERE id_produto = ?";
    private static final String LISTAR_POR_CODIGO = "SELECT * FROM produto WHERE id_produto = ?";
    private static final String LISTAR_TUDO = "SELECT * FROM produto";
    
    Connection conn;
    public ProdutoDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public void guardar(Produto produto){
        try{
            PreparedStatement ps = conn.prepareStatement(INSERIR);
            ps.setInt(1, produto.getCodigoProduto());
            ps.setString(2, produto.getNomeProduto());
            ps.setDouble(3, produto.getPrecoProduto());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void alterar(Produto produto){
        try{
            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setInt(1, produto.getCodigoProduto());
            ps.setString(2, produto.getNomeProduto());
            ps.setDouble(3, produto.getPrecoProduto());
             ps.setInt(4, produto.getIdProduto());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
            
    public void eliminar(Produto produto){
        try{
            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, produto.getIdProduto());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }        
    } 
    
    public List<Produto> listaTodos(){
        List<Produto> produtos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(LISTAR_TUDO);
            while(rs.next()){
                Produto produto = new Produto();
                popularProduto(produto, rs);
                produtos.add(produto);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return produtos;    
    }
    
    public Produto buscarPorId(int idProduto){
        Produto produto = new Produto();
        try{
            PreparedStatement ps = conn.prepareStatement(LISTAR_POR_CODIGO);
            ps.setInt(1, idProduto);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                popularProduto(produto, rs);
                
            }
            rs.close();           
        }catch(SQLException ex){
            ex.printStackTrace();        
        }
        return produto;
    }

    private void popularProduto(Produto produto, ResultSet rs) {
       try{
           produto.setIdProduto(rs.getInt("id_produto"));
           produto.setCodigoProduto(rs.getInt("codigo_produto"));
           produto.setNome(rs.getString("nome_produto"));
           produto.setPrecoProduto(rs.getDouble("preco_produto"));
       }catch(SQLException ex){
           ex.printStackTrace();
       }     
    }


    
}

























