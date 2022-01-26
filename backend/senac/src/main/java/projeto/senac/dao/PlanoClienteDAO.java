package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.Endereco;
import projeto.senac.modelo.Estado;
import projeto.senac.modelo.Logradouro;
import projeto.senac.modelo.Municipio;
import projeto.senac.modelo.PlanoCliente;
import projeto.senac.modelo.TipoDocumento;
import projeto.senac.modelo.TipoUsuario;
import projeto.senac.modelo.Usuario;

public class PlanoClienteDAO {
	
	public List<PlanoCliente> listar(){
		
		
		
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from plano_cliente;");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<PlanoCliente> lista = new ArrayList<PlanoCliente>();
		PlanoCliente p;
		
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				p = new PlanoCliente();
				
				p.setId_plano(rs.getInt("id_plano"));
				p.setPlanos(rs.getString("planos"));
				p.setPlanos_descricao(rs.getString("planos_descricao"));
				p.setPlanos_preco(rs.getDouble("planos_preco"));
				
				lista.add(p);
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
	
}
