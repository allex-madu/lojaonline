package lojaonline.dao;
import java.util.List;
import lojaonline.model.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Allex
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }
    /**
     * Test of guardar method, of class ClienteDAO.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Danilão");
        cliente.setSobrenomeCliente("de Paulo Rosa");
        
        ClienteDAO instance = new ClienteDAO();
        instance.guardar(cliente);
    }

    /**
     * Test of editar method, of class ClienteDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNomeCliente("Maria");
        cliente.setSobrenomeCliente("Do Rosario");
        ClienteDAO instance = new ClienteDAO();
        
        instance.editar(cliente);
    }

    /**
     * Test of eliminar method, of class ClienteDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        
        ClienteDAO instance = new ClienteDAO();
        instance.eliminar(cliente);
    }

    /**
     * Test of listaTodos method, of class ClienteDAO.
     */
    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        ClienteDAO instance = new ClienteDAO();
      
        List<Cliente> result = instance.listaTodos();
        assertTrue(result.size() > 0);
    }

    /**
     * Test of buscarPorId method, of class ClienteDAO.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        int idCliente = 2;
        ClienteDAO instance = new ClienteDAO();
       
        Cliente result = instance.buscarPorId(idCliente);
        assertNotNull(result);
        assertEquals(idCliente, result.getIdCliente());
    }
}
