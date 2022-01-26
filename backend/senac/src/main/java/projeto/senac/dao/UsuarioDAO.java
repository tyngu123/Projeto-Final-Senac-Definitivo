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
import projeto.senac.modelo.TipoDocumento;
import projeto.senac.modelo.TipoUsuario;
import projeto.senac.modelo.Usuario;
public class UsuarioDAO {
	public List<Usuario> listar(){
		
		
		
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from usuario u inner join tipo_usuario tu on tu.id_tipo = u.id_tipo inner join tipo_documento td on td.id_documento = u.id_documento inner join endereco e on e.id_endereco = u.id_endereco inner join logradouro l on l.id_logradouro = e.id_logradouro inner join bairro b on e.id_bairro = b.id_bairro inner join municipio m on e.id_municipio = m.id_municipio inner join estado es on m.id_estado = es.id_estado;");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario u;
		
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new Usuario();
				
				
				
		
				//Usuario
				u.setId_usuario(rs.getInt("id_usuario"));
				u.setNome_completo(rs.getString("nome_completo"));
				u.setApelido(rs.getString("apelido"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setDocumento(rs.getString("documento"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				
				//Tipo Documento
				TipoDocumento tipoDocumento = new TipoDocumento();
				tipoDocumento.setId_documento(rs.getInt("id_documento"));
				tipoDocumento.setDescricao(rs.getString("td.descricao"));
				u.setTipoDocumento(tipoDocumento);;
				
				//Tipo Usuário
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("tu.descricao"));
				u.setTipoUsuario(tipoUsuario);
				
				//Endereco
				Endereco endereco = new Endereco();
				endereco.setId_endereco(rs.getInt("id_endereco"));
				endereco.setCep(rs.getString("CEP"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setNome_rua(rs.getString("nome_rua"));
				endereco.setNumero(rs.getInt("numero"));
				Logradouro logradouro = new Logradouro();
				logradouro.setId_logradouro(rs.getInt("id_logradouro"));
				logradouro.setDescricao(rs.getString("l.descricao"));
				Municipio municipio = new Municipio();
				municipio.setId_municipio(rs.getInt("id_municipio"));
				municipio.setDescricao(rs.getString("m.descricao"));
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("es.descricao"));
				estado.setUf(rs.getString("UF"));
				
				municipio.setEstado(estado);
				endereco.setMunicipio(municipio);
				endereco.setLogradouro(logradouro);
				u.setEndereco(endereco);
				
				
				
				
				
				
				
				lista.add(u);
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
	
	public boolean cadastrar(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO usuario(nome_completo, apelido, nascimento, documento, id_documento,id_endereco, email, senha, id_tipo) VALUES( ?, ? ,?, ?, ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setString(1, usuario.getNome_completo());
			ps.setString(2, usuario.getApelido());
			ps.setDate(3, new java.sql.Date(usuario.getNascimento().getTime()));	
			ps.setString(4, usuario.getDocumento());
			ps.setInt(5, usuario.getTipoDocumento().getId_documento());
			ps.setInt(6, usuario.getEndereco().getId_endereco());
			ps.setString(7, usuario.getEmail());
			ps.setString(8, usuario.getSenha());
			ps.setInt(9, usuario.getTipoUsuario().getId_tipo());
			
			
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
//	
//	
	public boolean excluir(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("DELETE FROM usuario WHERE id_usuario = ?");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setInt(1, usuario.getId_usuario());
				
			
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
//	
//	public boolean alterar(Usuario usuario) {
//		Connection cnx = Dao.getConexao();
//		
//		StringBuilder sql = new StringBuilder();
//		
//		sql.append("UPDATE usuario SET email = ?, nome = ?, nascimento = ?, senha = ? WHERE id = ?");
//		
//		PreparedStatement ps; // 
//		
//		boolean retorno = true;
//		
//		
//		try {
//			ps = cnx.prepareStatement(sql.toString());
//			
//			
//			
//			
//			ps.setString(1, usuario.getEmail());
//			ps.setString(2, usuario.getNome());
//			ps.setDate(3, new java.sql.Date(usuario.getNascimento().getTime()));		
//			ps.setString(4, usuario.getSenha());	
//			ps.setInt(5, usuario.getId());
//				
//			
//			ps.execute();
//			ps.close();
//			cnx.close();
//				
//				
//			}
//		 catch (SQLException e) {
//			e.printStackTrace();
//			retorno = false;
//		} 
//		return retorno;
//	}
//	
	public Usuario executarLogin(String email,String senha) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("select * from usuario u inner join tipo_usuario tu on tu.id_tipo = u.id_tipo inner join tipo_documento td on td.id_documento = u.id_documento inner join endereco e on e.id_endereco = u.id_endereco inner join logradouro l on l.id_logradouro = e.id_logradouro inner join bairro b on e.id_bairro = b.id_bairro inner join municipio m on e.id_municipio = m.id_municipio inner join estado es on m.id_estado = es.id_estado WHERE email = ? AND senha = ?");
		
		PreparedStatement ps; // 
		
		//boolean retorno = true;
		Usuario u = new Usuario();
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setString(1, email);
			ps.setString(2, senha);
				
			
			
				
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				u = new Usuario();
				
				
				
				
				//Usuario
				u.setId_usuario(rs.getInt("id_usuario"));
				u.setNome_completo(rs.getString("nome_completo"));
				u.setApelido(rs.getString("apelido"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setDocumento(rs.getString("documento"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				
				//Tipo Documento
				TipoDocumento tipoDocumento = new TipoDocumento();
				tipoDocumento.setId_documento(rs.getInt("id_documento"));
				tipoDocumento.setDescricao(rs.getString("td.descricao"));
				u.setTipoDocumento(tipoDocumento);
				
				//Tipo Usuário
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("tu.descricao"));
				u.setTipoUsuario(tipoUsuario);
				
				//Endereco
				Endereco endereco = new Endereco();
				endereco.setId_endereco(rs.getInt("id_endereco"));
				endereco.setCep(rs.getString("CEP"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setNome_rua(rs.getString("nome_rua"));
				endereco.setNumero(rs.getInt("numero"));
				Logradouro logradouro = new Logradouro();
				logradouro.setId_logradouro(rs.getInt("id_logradouro"));
				logradouro.setDescricao(rs.getString("l.descricao"));
				Municipio municipio = new Municipio();
				municipio.setId_municipio(rs.getInt("id_municipio"));
				municipio.setDescricao(rs.getString("m.descricao"));
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("es.descricao"));
				estado.setUf(rs.getString("UF"));
				
				municipio.setEstado(estado);
				endereco.setMunicipio(municipio);
				endereco.setLogradouro(logradouro);
				u.setEndereco(endereco);
				
				
				
				
				
				
				
			
				
				
			}
			ps.execute();
			ps.close();
			cnx.close();
			}
		 catch (SQLException e) {
			e.printStackTrace();
			//retorno = false;
		} 
		return u;
	}
//	
	public Usuario buscarId(int id) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("select * from usuario u inner join tipo_usuario tu on tu.id_tipo = u.id_tipo inner join tipo_documento td on td.id_documento = u.id_documento inner join endereco e on e.id_endereco = u.id_endereco inner join logradouro l on l.id_logradouro = e.id_logradouro inner join bairro b on e.id_bairro = b.id_bairro inner join municipio m on e.id_municipio = m.id_municipio inner join estado es on m.id_estado = es.id_estado WHERE id_usuario = ?");
		
		PreparedStatement ps; // 
		
		//boolean retorno = true;
		Usuario u = new Usuario();
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setInt(1, id);
			
				
			
			
				
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new Usuario();
				
				
				
				
				//Usuario
				u.setId_usuario(rs.getInt("id_usuario"));
				u.setNome_completo(rs.getString("nome_completo"));
				u.setApelido(rs.getString("apelido"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setDocumento(rs.getString("documento"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				
				//Tipo Documento
				TipoDocumento tipoDocumento = new TipoDocumento();
				tipoDocumento.setId_documento(rs.getInt("id_documento"));
				tipoDocumento.setDescricao(rs.getString("td.descricao"));
				u.setTipoDocumento(tipoDocumento);
				
				//Tipo Usuário
				TipoUsuario tipoUsuario = new TipoUsuario();
				tipoUsuario.setId_tipo(rs.getInt("id_tipo"));
				tipoUsuario.setDescricao(rs.getString("tu.descricao"));
				u.setTipoUsuario(tipoUsuario);
				
				//Endereco
				Endereco endereco = new Endereco();
				endereco.setId_endereco(rs.getInt("id_endereco"));
				endereco.setCep(rs.getString("CEP"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setNome_rua(rs.getString("nome_rua"));
				endereco.setNumero(rs.getInt("numero"));
				Logradouro logradouro = new Logradouro();
				logradouro.setId_logradouro(rs.getInt("id_logradouro"));
				logradouro.setDescricao(rs.getString("l.descricao"));
				Municipio municipio = new Municipio();
				municipio.setId_municipio(rs.getInt("id_municipio"));
				municipio.setDescricao(rs.getString("m.descricao"));
				Estado estado = new Estado();
				estado.setId_estado(rs.getInt("id_estado"));
				estado.setDescricao(rs.getString("es.descricao"));
				estado.setUf(rs.getString("UF"));
				
				municipio.setEstado(estado);
				endereco.setMunicipio(municipio);
				endereco.setLogradouro(logradouro);
				u.setEndereco(endereco);
				
			}
			ps.execute();
			ps.close();
			cnx.close();
			}
		 catch (SQLException e) {
			e.printStackTrace();
			//retorno = false;
		} 
		return u;
	}



	}