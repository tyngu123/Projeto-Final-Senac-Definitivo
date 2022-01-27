package projeto.senac;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import projeto.senac.modelo.Cartao;
import projeto.senac.modelo.Endereco;
import projeto.senac.modelo.PlanoCliente;
import projeto.senac.modelo.TipoUsuario;
import projeto.senac.modelo.Usuario;
import projeto.senac.modelo.Vaga;
import projeto.senac.modelo.Venda;
import projeto.senac.servico.CartaoServico;
import projeto.senac.servico.EnderecoServico;
import projeto.senac.servico.PlanoClienteServico;
import projeto.senac.servico.TipoUsuarioServico;
import projeto.senac.servico.UsuarioServico;
import projeto.senac.servico.VagaServico;
import projeto.senac.servico.VendaServico;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    //Serviços de listagem
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listar")
    public Response getUsuarios() {
    	UsuarioServico servico = new UsuarioServico();
    	List<Usuario> lista = servico.listarUsuarios();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();

    	return response;
    	
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listarVagas")
    public Response getVaga() {
    	VagaServico servico = new VagaServico();
    	List<Vaga> lista = servico.listarVagas();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();
    	
    	return response;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listarTipo")
    public Response getTipoUsuarios() {
    	TipoUsuarioServico servico = new TipoUsuarioServico();
    	List<TipoUsuario> lista = servico.listarTipoUsuarios();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();
    	
    	return response;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listarVendas")
    public Response getVendas() {
    	VendaServico servico = new VendaServico();
    	List<Venda> lista = servico.listarVendas();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();
    	
    	return response;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listarPlanos")
    public Response getPlanos() {
    	PlanoClienteServico servico = new PlanoClienteServico();
    	List<PlanoCliente> lista = servico.listarPlanoCliente();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();
    	
    	return response;
    }
    
    //Serviços de inclusão  // Não funcionando
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrar")
    public Response postUsuario(Usuario usuario) throws SQLException {
    	UsuarioServico servico = new UsuarioServico();
    	servico.cadastrarUsuarios(usuario);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    	
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrarEndereco")
    public Response postEndereco(Endereco endereco) {
    	EnderecoServico servico = new EnderecoServico();
    	servico.cadastrarEndereco(endereco);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    	
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrarCartao")
    public Response postCartao(Cartao cartao) {
    	CartaoServico servico = new CartaoServico();
    	servico.cadastrarCartao(cartao);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    	
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrarVenda")
    public Response postVenda(Venda venda) {
    	VendaServico servico = new VendaServico();
    	servico.cadastrarVenda(venda);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    	
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrarVaga")
    public Response postVaga(Vaga vaga) {
    	VagaServico servico = new VagaServico();
    	servico.cadastrarVagas(vaga);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    	
    }

    //Serviços de exclusão
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("excluir")
    public Response deleteUsuario(Usuario usuario) {
    	UsuarioServico servico = new UsuarioServico();
    	servico.excluirUsuarios(usuario);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;  
    	
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("excluirVaga")
    public Response deleteVaga(Vaga vaga) {
    	VagaServico servico = new VagaServico();
    	servico.excluirVaga(vaga);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	
    	return response;  
    	
    }
//    Serviços de alteração
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("alterarVaga")
    public Response putVaga(Vaga vaga) {
    	VagaServico servico = new VagaServico();
    	servico.alterarVaga(vaga);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response; 
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("alterar")
    public Response putUsuario(Usuario usuario) {
    	UsuarioServico servico = new UsuarioServico();
    	servico.alterarUsuario(usuario);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response; 
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("alterarEndereco")
    public Response putEndereco(Endereco endereco) {
    	EnderecoServico servico = new EnderecoServico();
    	servico.alterarEndereco(endereco);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response; 
    }
    
    //Serviço de autentificação
    @GET
    @Produces(MediaType.APPLICATION_JSON)
   // @Consumes(MediaType.APPLICATION_JSON)
    @Path("logar")
    public Response getLoginInfo(@QueryParam("email")String email,@QueryParam("senha")String senha) {
    	UsuarioServico servico = new UsuarioServico();
    	Usuario usuario = servico.logarUsuario(email,senha);
    	if(usuario.getId_usuario() != 0) {
    		Response response = Response.status(200)
    				.header("Access-Control-Allow-Origin", "*")
    				.header("Access-Control-Allow-Credentials", "true")
    				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
    				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
    				.entity(usuario).build();
    		return response;
        	} else {
        	Response response = Response.ok().entity("Usuário ou senha incorreto.").build();
            return response;
        	}
    }
    
    // Serviços de Busca
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("buscarId")
    public Response getUsuariosId(@QueryParam("id_usuario")int id) {
    	UsuarioServico servico = new UsuarioServico();
    	Usuario usuario= servico.buscarUsuarioId(id);
    	if(usuario.getId_usuario() != 0) {
    		Response response = Response.status(200)
    				.header("Access-Control-Allow-Origin", "*")
    				.header("Access-Control-Allow-Credentials", "true")
    				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
    				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
    				.entity(usuario).build();
        	return response;
        	} else {
        	Response response = Response.ok().entity("Não foi possível encontrar esse usuário").build();
            return response;
        	}

        }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("buscarVagaId")
    public Response getVagaId(@QueryParam("id_vagas")int id) {
    	VagaServico servico = new VagaServico();
    	Vaga vaga = servico.buscarVagaId(id);
    	if(vaga.getId_vagas() != 0) {
    		Response response = Response.status(200)
    				.header("Access-Control-Allow-Origin", "*")
    				.header("Access-Control-Allow-Credentials", "true")
    				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
    				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
    				.entity(vaga).build();
        	return response;
        	} else {
        	Response response = Response.ok().entity("Não foi possível encontrar essa vaga").build();
            return response;
        	}

        }
    
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("buscarVagas")
	  public Response getVagasNome(@QueryParam("titulo")String vaga) {
	  	VagaServico servico = new VagaServico();
	  	List<Vaga> lista = servico.buscarVagas(vaga);
	
	
	  	if(!lista.isEmpty()) {
	  		Response response = Response.status(200)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Credentials", "true")
					.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
					.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
					.entity(lista).build();
	
	  		return response;
	  	} else {
	  		Response response = Response.ok().entity("Vaga não encontrada").build();
	
	      	return response;
	  	}
  }
	  
	  // É necessária que mude o (estado) no banco de dados para chave estrangeira 
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("buscarVagasEstado")
	  public Response getVagasEstado(@QueryParam("estado")String estado) {
	  	VagaServico servico = new VagaServico();
	  	List<Vaga> lista = servico.buscarVagasEstado(estado);
	
	
	  	if(!lista.isEmpty()) {
	  		Response response = Response.status(200)
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Credentials", "true")
					.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
					.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
					.entity(lista).build();
	
	  		return response;
	  	} else {
	  		Response response = Response.ok().entity("Não há vagas disponíveis nessa região").build();
	
	      	return response;
	  	}
  }
	  
	  


    }