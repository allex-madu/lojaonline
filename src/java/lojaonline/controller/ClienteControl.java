package lojaonline.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lojaonline.dao.ClienteDAO;
import lojaonline.model.Cliente;
/**
 * @author Allex
 */
@WebServlet(name = "ClienteControl", urlPatterns = {"/ClienteControl"})
public class ClienteControl extends HttpServlet {

    ClienteDAO clienteDAO = new ClienteDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String accao = request.getParameter("accao");
            
            if(accao.equalsIgnoreCase("guardar")){
                Cliente cliente = new Cliente();
                cliente.setNomeCliente(request.getParameter("input_nome"));
                cliente.setSobrenomeCliente(request.getParameter("input_sobrenome"));
                clienteDAO.guardar(cliente);
                
                RequestDispatcher rd = request.getRequestDispatcher("cliente_guardar.jsp");
                rd.forward(request, response);
            }else if(accao.equalsIgnoreCase("editar")){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(Integer.parseInt(request.getParameter("input_id_cliente")));
                cliente.setNomeCliente(request.getParameter("input_nome"));
                cliente.setSobrenomeCliente(request.getParameter("input_sobrenome"));
                clienteDAO.editar(cliente);
                RequestDispatcher rd = request.getRequestDispatcher("cliente_listar.jsp");
                rd.forward(request, response);
             }else if(accao.equalsIgnoreCase("eliminar")){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(Integer.parseInt(request.getParameter("input_id_cliente")));
                clienteDAO.eliminar(cliente);
                RequestDispatcher rd = request.getRequestDispatcher("cliente_listar.jsp");
                rd.forward(request, response);
            }else if(accao.equalsIgnoreCase("buscar_por_id")){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(Integer.parseInt(request.getParameter("input_id_cliente")));
                
                cliente = clienteDAO.buscarPorId(6);
                request.setAttribute("cliente", cliente);
                RequestDispatcher rd = request.getRequestDispatcher("cliente_editar.jsp");
                rd.forward(request, response);
            }else if(accao.equalsIgnoreCase("listar")){
                response.sendRedirect("cliente lista.jsp");
            }
        }catch(IOException | NumberFormatException | ServletException ex){
            System.err.println("Erro na interação: "+ex.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
