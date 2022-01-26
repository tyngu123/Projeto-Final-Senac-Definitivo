package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.EnderecoDAO;
import projeto.senac.dao.UsuarioDAO;
import projeto.senac.dao.VendaDAO;
import projeto.senac.modelo.Endereco;
import projeto.senac.modelo.Usuario;
import projeto.senac.modelo.Venda;

public class VendaServico {
		
	public List<Venda> listarVendas(){
    	VendaDAO dao = new VendaDAO();
    	List<Venda> lista = dao.listar();
    	
    	return lista;
	}
	
	public boolean cadastrarVenda(Venda venda) {
		VendaDAO dao = new VendaDAO();
		
		return dao.cadastrar(venda);
	}
		
}