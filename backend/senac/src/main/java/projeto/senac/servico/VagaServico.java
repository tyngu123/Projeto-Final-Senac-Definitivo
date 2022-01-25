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
		
		public List<Vaga> buscarVagas(String vaga){
    	VagaDAO dao = new VagaDAO();
    	List<Vaga> lista = dao.buscarVagas(vaga);

    	return lista;
		}
		
		public Vaga buscarVagaId(int id) {
			VagaDAO dao = new VagaDAO();
			
			return dao.buscarId(id);
		}
		
		public List<Vaga> buscarVagasEstado(String estado){
	    	VagaDAO dao = new VagaDAO();
	    	List<Vaga> lista = dao.buscarVagasEstado(estado);

	    	return lista;
		}
		
		public boolean excluirVaga(Vaga vaga) {
			VagaDAO dao = new VagaDAO();
			
			return dao.excluir(vaga);
		}
}