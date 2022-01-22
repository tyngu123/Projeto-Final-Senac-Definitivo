package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.UsuarioDAO;
import projeto.senac.dao.VagaDAO;
import projeto.senac.modelo.Usuario;
import projeto.senac.modelo.Vaga;

public class VagaServico {

	
		public List<Vaga> listarVagas(){
	    	VagaDAO dao = new VagaDAO();
	    	List<Vaga> lista = dao.listar();
	    	
	    	return lista;
		}
		
		public boolean cadastrarVagas(Vaga vaga) {
			VagaDAO dao = new VagaDAO();
			
			return dao.cadastrar(vaga);
		}
}
