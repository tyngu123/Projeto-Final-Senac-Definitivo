package projeto.senac.resource;

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

import projeto.senac.dao.EnderecoDAO;
import projeto.senac.dao.UsuarioDAO;
import projeto.senac.modelo.Endereco;
import projeto.senac.modelo.Usuario;

@Path("appTutorial")
public class UsuarioResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listar")
    public Response getUsuarios() {
    	UsuarioDAO dao = new UsuarioDAO();
    	List<Usuario> lista = dao.listar();
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(lista).build();
    	
    	return response;
    }
//    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cadastrar")
    public Response getUsuariosCadastro(Usuario usuario) {
    	UsuarioDAO dao = new UsuarioDAO();
    	EnderecoDAO dao2 = new EnderecoDAO();
    	Endereco endereco = new Endereco();
    	dao2.cadastrar(endereco);
    	dao.cadastrar(usuario);
    	
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;  
    	
    }
//    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("excluir")
    public Response getUsuariosExcluir(Usuario usuario) {
    	UsuarioDAO dao = new UsuarioDAO();
    	dao.excluir(usuario);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;  
    	
    }
//    
//    @PUT
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("alterar")
//    public Response getUsuariosAlterar(Usuario usuario) {
//    	UsuarioDAO dao = new UsuarioDAO();
//    	dao.alterar(usuario);
//    	
//    	Response response = Response.ok().entity(true).build();
//    	return response;
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("logar")
    public Response getUsuariosLogar(@QueryParam("email")String email,@QueryParam("senha")String senha) {
    	UsuarioDAO dao = new UsuarioDAO();
    	dao.executarLogin(email,senha);
    	
    	Response response = Response.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(true).build();
    	return response;
    }
    
    
    
  
    
    
   
}