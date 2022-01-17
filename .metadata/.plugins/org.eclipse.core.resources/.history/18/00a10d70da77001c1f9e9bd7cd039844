package projeto.senac.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.Usuario;

public class UsuarioDAO {
	public List<Usuario> listar(){
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM usuario");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario u;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new Usuario();
				
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setSenha(rs.getString("senha"));
				
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
		
		sql.append("INSERT INTO usuario(email, nome, nascimento,senha) VALUES(?,?,?,?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getNome());
			ps.setDate(3, new java.sql.Date(usuario.getNascimento().getTime()));	
			ps.setString(4, usuario.getSenha());	
			
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
	
	
	public boolean excluir(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("DELETE FROM usuario WHERE id = ?");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setInt(1, usuario.getId());
				
			
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
	
	public boolean alterar(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("UPDATE usuario SET email = ?, nome = ?, nascimento = ?, senha = ? WHERE id = ?");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getNome());
			ps.setDate(3, new java.sql.Date(usuario.getNascimento().getTime()));		
			ps.setString(4, usuario.getSenha());	
			ps.setInt(5, usuario.getId());
				
			
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
	
	public Usuario executarLogin(String email,String senha) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM usuario WHERE email = ? AND senha = ?");
		
		PreparedStatement ps; // 
		
		//boolean retorno = true;
		Usuario u = new Usuario();
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setString(1, email);
			ps.setString(2, senha);
				
			
			
				
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setSenha(rs.getString("senha"));
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
	
	public Usuario buscarId(int id) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM usuario WHERE id = ?");
		
		PreparedStatement ps; // 
		
		//boolean retorno = true;
		Usuario u = new Usuario();
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setInt(1, id);
			
				
			
			
				
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setSenha(rs.getString("senha"));
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
	
	public List<Usuario> buscarNome(String nome){
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM usuario WHERE nome = ?");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario u;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new Usuario();
				
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setSenha(rs.getString("senha"));
				
				lista.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
	
	
	
		
	}
	
	
	
	