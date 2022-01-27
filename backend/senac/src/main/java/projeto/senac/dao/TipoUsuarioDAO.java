package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.TipoDocumento;
import projeto.senac.modelo.TipoUsuario;
import projeto.senac.modelo.Usuario;

public class TipoUsuarioDAO {

public List<TipoUsuario> listar(){
		
		
		
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tipo_usuario");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<TipoUsuario> lista = new ArrayList<TipoUsuario>();
		
		TipoUsuario t;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				t = new TipoUsuario();
				
				
				t.setId_tipo(rs.getInt("id_tipo"));
				t.setDescricao(rs.getString("descricao"));
				
				lista.add(t);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
}