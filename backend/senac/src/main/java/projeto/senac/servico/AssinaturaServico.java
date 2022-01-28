package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.AssinaturaClienteDAO;
import projeto.senac.modelo.AssinaturaCliente;
import projeto.senac.modelo.PlanoCliente;

public class AssinaturaServico {
	
	public List<AssinaturaCliente> listarAssinaturaCliente(){
    	AssinaturaClienteDAO dao = new AssinaturaClienteDAO();
    	List<AssinaturaCliente> lista = dao.listar();
    	
    	return lista;
	}
}
