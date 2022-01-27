package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.Estado;
import projeto.senac.modelo.TipoUsuario;
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
				+ "inner join estado e\r\n"
				+ "on v.id_estado = e.id_estado\r\n"
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
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("e.descricao"));
				estado.setUf(rs.getString("UF"));
				v.setEstado(estado);
				v.setRequisitos(rs.getString("requisitos"));
				
				//Usuário
				Usuario usuario = new Usuario();
				usuario.setId_usuario(rs.getInt("id_usuario"));
				usuario.setNome_completo(rs.getString("nome_completo"));
				usuario.setApelido(rs.getString("apelido"));
				//usuario.setNascimento(rs.getDate("nascimento"));
				usuario.setDocumento(rs.getString("documento"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("t.descricao"));
				
				usuario.setTipoUsuario(tipoUsuario);
				v.setUsuario(usuario);
				
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
		
		sql.append("INSERT INTO vagas(id_usuario, titulo, descricao, salario, beneficio, carga_horaria, id_estado, requisitos) VALUES( ? ,?, ?, ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setInt(1, vaga.getUsuario().getId_usuario());
			ps.setString(2, vaga.getTitulo());	
			ps.setString(3, vaga.getDescricao());
			ps.setDouble(4, vaga.getSalario());
			ps.setString(5, vaga.getBeneficio());
			ps.setString(6, vaga.getCarga_horaria());
			ps.setInt(7, vaga.getEstado().getId_estado());
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
	
	

	public List<Vaga> buscarVagas(String vaga){
		Connection cnx = Dao.getConexao();

		StringBuilder sql = new StringBuilder();
		sql.append("select * from vagas v\r\n"
				+ "join usuario u\r\n"
				+ "on u.id_usuario = v.id_vagas\r\n"
				+ "join tipo_usuario t\r\n"
				+ "on u.id_tipo = t.id_tipo\r\n"
				+ "inner join estado e\r\n"
				+ "on v.id_estado = e.id_estado\r\n"
				+ "WHERE titulo = ?\r\n"
				+ "ORDER BY id_vagas DESC;");

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
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("descricao"));
				estado.setUf(rs.getString("UF"));
				v.setEstado(estado);
				
				v.setRequisitos(rs.getString("requisitos"));
				
				//Usuário
				Usuario usuario = new Usuario();
				usuario.setId_usuario(rs.getInt("id_usuario"));
				usuario.setNome_completo(rs.getString("nome_completo"));
				usuario.setApelido(rs.getString("apelido"));
				usuario.setNascimento(rs.getDate("nascimento"));
				usuario.setDocumento(rs.getString("documento"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("t.descricao"));
				
				usuario.setTipoUsuario(tipoUsuario);
				v.setUsuario(usuario);
				
				lista.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}

	}
	
	public Vaga buscarId(int id){
		Connection cnx = Dao.getConexao();

		StringBuilder sql = new StringBuilder();
		sql.append("select * from vagas v\r\n"
				+ "join usuario u\r\n"
				+ "on u.id_usuario = v.id_vagas\r\n"
				+ "join tipo_usuario t\r\n"
				+ "on u.id_tipo = t.id_tipo\r\n"
				+ "inner join estado e\r\n"
				+ "on v.id_estado = e.id_estado\r\n"
				+ "WHERE id_vagas = ?;");
				

		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 

	
		Vaga v = new Vaga();

		try {
			ps = cnx.prepareStatement(sql.toString());

			ps.setInt(1, id);

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
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("descricao"));
				estado.setUf(rs.getString("UF"));
				v.setEstado(estado);
				v.setRequisitos(rs.getString("requisitos"));
				
				//Usuário
				Usuario usuario = new Usuario();
				usuario.setId_usuario(rs.getInt("id_usuario"));
				usuario.setNome_completo(rs.getString("nome_completo"));
				usuario.setApelido(rs.getString("apelido"));
				usuario.setNascimento(rs.getDate("nascimento"));
				usuario.setDocumento(rs.getString("documento"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("t.descricao"));
				
				usuario.setTipoUsuario(tipoUsuario);
				v.setUsuario(usuario);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			
		}
		return v;

	}
	
	public List<Vaga> buscarVagasEstado(String estado){
		Connection cnx = Dao.getConexao();

		StringBuilder sql = new StringBuilder();
		sql.append("select * from vagas v\r\n"
				+ "join usuario u\r\n"
				+ "on u.id_usuario = v.id_vagas\r\n"
				+ "join tipo_usuario t\r\n"
				+ "on u.id_tipo = t.id_tipo\r\n"
				+ "inner join estado e\r\n"
				+ "on v.id_estado = e.id_estado\r\n"
				+ "WHERE e.UF = ?\r\n"
				+ "ORDER BY id_vagas DESC;");

		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 

		List<Vaga> lista = new ArrayList<Vaga>();
		Vaga v;

		try {
			ps = cnx.prepareStatement(sql.toString());

			ps.setString(1, estado);

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
				Estado es = new Estado();
				es.setId_estado(rs.getInt("id_estado"));
				es.setDescricao(rs.getString("descricao"));
				es.setUf(rs.getString("UF"));
				v.setEstado(es);
				v.setRequisitos(rs.getString("requisitos"));
				
				//Usuário
				Usuario usuario = new Usuario();
				usuario.setId_usuario(rs.getInt("id_usuario"));
				usuario.setNome_completo(rs.getString("nome_completo"));
				usuario.setApelido(rs.getString("apelido"));
				usuario.setNascimento(rs.getDate("nascimento"));
				usuario.setDocumento(rs.getString("documento"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("t.descricao"));
				
				usuario.setTipoUsuario(tipoUsuario);
				v.setUsuario(usuario);
				
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