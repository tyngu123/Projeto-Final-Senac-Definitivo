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
		sql.append("select * from vagas v\r\n"
				+ "join usuario u\r\n"
				+ "on u.id_usuario = v.id_vagas\r\n"
				+ "join tipo_usuario t\r\n"
				+ "on u.id_tipo = t.id_tipo\r\n"
				+ "ORDER BY id_vagas DESC;");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Vaga> lista = new ArrayList<Vaga>();
		Vaga v;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				v = new Vaga();
				
				//Vagas
				v.setId_vagas(rs.getInt("id_vagas"));
				v.setTitulo(rs.getString("titulo"));
				v.setDescricao(rs.getString("descricao"));
				v.setSalario(rs.getDouble("salario"));
				v.setBeneficio(rs.getString("beneficio"));
				v.setCarga_horaria(rs.getString("carga_horaria"));
				v.setEstadoNome(rs.getString("estado"));
				v.setRequisitos(rs.getString("requisitos"));
				
				//Usuario/Empresa que postou a vaga
				v.setId_usuario(rs.getInt("u.id_usuario"));
				v.setNome_completo(rs.getString("u.nome_completo"));
				v.setId_tipo(rs.getInt("t.id_tipo"));
				v.setDescricao_tipo(rs.getString("t.descricao"));
				
				lista.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
	
	// NAO TESTADO
	public boolean cadastrar(Vaga vaga) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO vagas(id_usuario, titulo, descricao, salario, beneficio, carga_horaria, estado, requisitos) VALUES( ? ,?, ?, ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			//ps.setInt(1, vaga.getUsuario().getId_usuario());
			ps.setString(2, vaga.getTitulo());	
			ps.setString(3, vaga.getDescricao());
			ps.setDouble(4, vaga.getSalario());
			ps.setString(5, vaga.getBeneficio());
			ps.setString(6, vaga.getCarga_horaria());
			ps.setString(7, vaga.getEstadoNome());
			ps.setString(8, vaga.getRequisitos());
			
			
			ps.execute();
			ps.close();
			cnx.close();
				
				
			}
		 catch (SQLException e) {
			e.printStackTrace();
			retorno = false;
		} 
		return retorno;
	}
	
	//NAO TESTADO
	public boolean excluir(Vaga vaga) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("DELETE FROM vagas WHERE id_vagas = ?");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setInt(1, vaga.getId_vagas());
				
			
			ps.execute();
			ps.close();
			cnx.close();
				
				
			}
		 catch (SQLException e) {
			e.printStackTrace();
			retorno = false;
		} 
		return retorno;
	}
	
	
	// NAO TESTADO
	public List<Vaga> buscarNome(String vaga){
		Connection cnx = Dao.getConexao();

		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM vagas WHERE titulo = ?");

		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 

		List<Vaga> lista = new ArrayList<Vaga>();
		Vaga v;

		try {
			ps = cnx.prepareStatement(sql.toString());

			ps.setString(1, vaga);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				v = new Vaga();

				//Vagas
				v.setId_vagas(rs.getInt("id_vagas"));
				v.setTitulo(rs.getString("titulo"));
				v.setDescricao(rs.getString("descricao"));
				v.setSalario(rs.getDouble("salario"));
				v.setBeneficio(rs.getString("beneficio"));
				v.setCarga_horaria(rs.getString("carga_horaria"));
				v.setEstadoNome(rs.getString("estado"));
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
