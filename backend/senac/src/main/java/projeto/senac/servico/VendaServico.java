package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.VendaDAO;
import projeto.senac.modelo.Venda;

public class VendaServico {
		
	public List<Venda> listarVendas(){
    	VendaDAO dao = new VendaDAO();
    	List<Venda> lista = dao.listar();
    	
    	return lista;
	}
		
}