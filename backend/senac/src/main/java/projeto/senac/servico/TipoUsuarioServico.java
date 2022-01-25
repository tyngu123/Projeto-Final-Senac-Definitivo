package projeto.senac.servico;

import java.util.List;

import projeto.senac.dao.TipoUsuarioDAO;
import projeto.senac.dao.UsuarioDAO;
import projeto.senac.modelo.TipoUsuario;
import projeto.senac.modelo.Usuario;

public class TipoUsuarioServico {
	
	
	public List<TipoUsuario> listarTipoUsuarios(){
    	TipoUsuarioDAO dao = new TipoUsuarioDAO();
    	List<TipoUsuario> lista = dao.listar();
    	
    	return lista;
	}
	
}