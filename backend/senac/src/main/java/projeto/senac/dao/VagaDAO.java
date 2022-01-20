package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.Usuario;
import projeto.senac.modelo.Vaga;

public class VagaDAO {
	
	
	public List<Vaga> listar(){
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM vagas ORDER BY id_vagas DESC");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Vaga> lista = new ArrayList<Vaga>();
		Vaga v;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				v = new Vaga();
				
				v.setId_vagas(rs.getInt("id_vagas"));
				v.setTitulo(rs.getString("titulo"));
				v.setDescricao(rs.getString("descricao"));
				v.setSalario(rs.getDouble("salario"));
				v.setBeneficio(rs.getString("beneficio"));
				v.setCarga_horaria(rs.getString("carga_horaria"));
				v.setEstado(rs.getString("estado"));
				v.setRequisitos(rs.getString("requisitos"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
}
