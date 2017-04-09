/*
* Para alterar este cabeçalho de licença, escolha Cabeçalhos de Licença em Propriedades 
* do Projeto. Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
* E abra o modelo no editor.
*/
package lojaonline.dao;

import java.util.List;
import lojaonline.model.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Allex
 */
public class ProdutoDAOTest {
    
   
    /**
     * Test of guardar method, of class ProdutoDAO.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        
        Produto produto = new Produto();
        produto.setNome("Sapatilha_nova");
        produto.setCodigoProduto(1112244);
        produto.setPrecoProduto(15.00);
        
        ProdutoDAO instance = new ProdutoDAO();
        instance.guardar(produto);
    }

    /**
     * Test of alterar method, of class ProdutoDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("editar");
        
        Produto produto = new Produto();       
        produto.setCodigoProduto(123457);
        produto.setNome("Sapato mudado");        
        produto.setPrecoProduto(10.0);
        produto.setIdProduto(2);
        
        ProdutoDAO instance = new ProdutoDAO();
        instance.alterar(produto);
    }

    /**
     * Test of eliminar method, of class ProdutoDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        
        Produto produto = new Produto();
        produto.setIdProduto(9);
        
        ProdutoDAO instance = new ProdutoDAO();
        instance.eliminar(produto);
    }

    /**
     * Test of listaTodos method, of class ProdutoDAO.
     */
    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        ProdutoDAO instance = new ProdutoDAO();
      
        List<Produto> result = instance.listaTodos();
        assertTrue(result.size() > 0);
    }

    /**
     * Test of buscarPorId method, of class ProdutoDAO.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        int idProduto = 4;
        ProdutoDAO instance = new ProdutoDAO();
       
        Produto result = instance.buscarPorId(idProduto);
        assertNotNull(result);
        assertEquals(idProduto, result.getIdProduto());
    }
    
}
