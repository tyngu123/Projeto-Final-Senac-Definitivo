package projeto.senac.servico;

import projeto.senac.dao.EnderecoDAO;
import projeto.senac.dao.UsuarioDAO;
import projeto.senac.modelo.Endereco;
import projeto.senac.modelo.Usuario;

public class EnderecoServico {
	
	public boolean cadastrarEndereco(Endereco endereco) {
		
		EnderecoDAO dao = new EnderecoDAO();
		dao.cadastrar(endereco);
		
		return dao.cadastrar(endereco);
	}
	
	public boolean alterarEndereco(Endereco endereco) {
		
		EnderecoDAO dao = new EnderecoDAO();
		dao.alterar(endereco);
		
		return dao.alterar(endereco);
	}
}
