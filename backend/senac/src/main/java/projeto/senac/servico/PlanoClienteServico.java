package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.PlanoClienteDAO;
import projeto.senac.dao.VagaDAO;
import projeto.senac.modelo.PlanoCliente;
import projeto.senac.modelo.Vaga;

public class PlanoClienteServico {
	
	public List<PlanoCliente> listarPlanoCliente(){
    	PlanoClienteDAO dao = new PlanoClienteDAO();
    	List<PlanoCliente> lista = dao.listar();
    	
    	return lista;
	}
	
}
