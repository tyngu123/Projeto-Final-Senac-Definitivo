package projeto.senac.servico;

import projeto.senac.dao.CartaoDAO;
import projeto.senac.modelo.Cartao;


public class CartaoServico {

	public boolean cadastrarCartao(Cartao cartao) {
		CartaoDAO dao = new CartaoDAO();
		
		return dao.cadastrar(cartao);
	}
}
