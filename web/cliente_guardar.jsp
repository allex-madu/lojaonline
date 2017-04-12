<%-- 
    Document   : produto_guardar
    Created on : 09/04/2017, 14:15:58
    Author     : Allex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" />
        <link href="css/estilo.css" rel="stylesheet" />
        <script src="css/bootstrap-3.3.7/js/bootstrap.min.js"></script>
        <script src="js/jquery-3.1.0.min.js"></script>
        <title>Loja Online - Novo Produto</title>
    </head>
    
    <body>
        <div class="container">
            <form role="form" class="form-horizontal">
                <h2 class="titulo_produto">Novo Cliente</h2>
                <div class="form-group">
                    <label class="col-xs-3 control-label">Nome</label>
                    <div class="col-xs-4">
                        <input type="text" class="form-control" name="input_nome" placeholder="Nome" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-xs-3 control-label">Sobrenome</label>
                    <div class="col-xs-4">
                        <input type="text" class="form-control" name="input_sobrenome" placeholder="Sobrenome" />
                    </div>
                </div>
                <div>
                    <button type="submit" class="btn btn-primary botao">Guardar</button>
                </div>
            </form>
            
            
        </div>


    </body>
</html>

















