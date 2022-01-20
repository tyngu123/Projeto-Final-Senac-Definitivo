package projeto.senac.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import projeto.senac.dao.VagaDAO;
import projeto.senac.modelo.Vaga;

@Path("appTutorial")
public class VagaResource {

	
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    @Path("listarVagas")
	    public Response getVagas() {
	    	VagaDAO dao = new VagaDAO();
	    	List<Vaga> lista = dao.listar();
	    	
	    	Response response = Response.ok().entity(lista).build();
	    	
	    	return response;
	    }
}
