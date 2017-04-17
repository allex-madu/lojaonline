<%-- 
    Document   : cliente_listar
    Created on : 11/04/2017, 21:26:57
    Author     : Allex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="lojaonline.model.Produto"%>
<%@page import="lojaonline.dao.ProdutoDAO"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" />
        <link href="css/estilo.css" rel="stylesheet" />
        <script src="css/bootstrap-3.3.7/js/bootstrap.min.js"></script>
        <script src="js/jquery-3.1.0.min.js"></script>
        <title>Loja Online - Listagem de Clientes</title>
    </head>
    <body>
        <div class="container">
            <%
                ProdutoDAO produtoDao = new ProdutoDAO();
                List<Produto> produtos = produtoDao.listaTodos();
            %>
            <h2>Lista de Produtos</h2>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Preco</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                
                <tbody>
                    <% for(Produto produto:produtos){%>
                    <tr>
                        <td><%= produto.getCodigoProduto() %></td>
                        <td><%= produto.getNomeProduto() %></td>
                        <td><%= produto.getPrecoProduto() %></td>
                        <td>
                            <a href="#">Detalhes</a>
                            <a href="#">Editar</a>
                            <a href="#">Excluir</a>
                        </td>
                    </tr>
                    <% }//Fim for %>
                </tbody>
            </table>
        </div>
    </body>
</html>
