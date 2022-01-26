package projeto.senac.servico;
import java.util.List;

import projeto.senac.dao.EnderecoDAO;

import projeto.senac.dao.UsuarioDAO;
import projeto.senac.modelo.Endereco;

import projeto.senac.modelo.Usuario;

public class UsuarioServico {
	
	public List<Usuario> listarUsuarios(){
    	UsuarioDAO dao = new UsuarioDAO();
    	//TipoUsuarioDAO dao2 = new TipoUsuarioDAO();
    	
    	List<Usuario> lista = dao.listar();
  
    	
    	return lista;
	}
	
	public boolean cadastrarUsuarios(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		EnderecoDAO dao2 = new EnderecoDAO();
		Endereco endereco = new Endereco();
		dao2.cadastrar(endereco);
		
		return dao.cadastrar(usuario);
	}
//	
	public boolean excluirUsuarios(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		
		return dao.excluir(usuario);
	}
//	
//	public boolean alterarUsuarios(Usuario usuario) {
//		UsuarioDAO dao = new UsuarioDAO();
//		
//		return dao.alterar(usuario);
//	}
//	
	public Usuario buscarUsuarioId(int id) {
		UsuarioDAO dao = new UsuarioDAO();
		
		return dao.buscarId(id);
	}
	
	public Usuario logarUsuario(String email,String senha) {
		UsuarioDAO dao = new UsuarioDAO();
		
		return dao.executarLogin(email, senha);
	}




} 