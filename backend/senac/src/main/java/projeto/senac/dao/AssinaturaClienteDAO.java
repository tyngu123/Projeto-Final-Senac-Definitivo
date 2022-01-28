package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.AssinaturaCliente;
import projeto.senac.modelo.PlanoCliente;
import projeto.senac.modelo.Usuario;

public class AssinaturaClienteDAO {
	
public List<AssinaturaCliente> listar(){
		
		
		
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from assinatura_do_cliente a\r\n"
				+ "join usuario u\r\n"
				+ "on a.id_usuario = u.id_usuario\r\n"
				+ "join plano_cliente p\r\n"
				+ "on a.id_plano = p.id_plano;");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<AssinaturaCliente> lista = new ArrayList<AssinaturaCliente>();
		AssinaturaCliente a;
		
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				a = new AssinaturaCliente();
								

				a.setId_assinatura(rs.getInt("id_assinatura"));
				
				//Usuario
				Usuario u = new Usuario();
				u.setId_usuario(rs.getInt("id_usuario"));
				u.setNome_completo(rs.getString("nome_completo"));
				u.setApelido(rs.getString("apelido"));
				u.setNascimento(rs.getDate("nascimento"));
				u.setDocumento(rs.getString("documento"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				
				//Plano Cliente
				PlanoCliente p = new PlanoCliente();
				p.setId_plano(rs.getInt("id_plano"));
				p.setPlanos(rs.getString("planos"));
				p.setPlanos_descricao(rs.getString("planos_descricao"));
				p.setPlanos_preco(rs.getDouble("planos_preco"));
				
				a.setUsuario(u);
				a.setPlanoCliente(p);
				
	
				lista.add(a);
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}

//	public boolean efetuarPagamento(AssinaturaCliente assinatura) {
//		
//	Connection cnx = Dao.getConexao();
//
//	StringBuilder sql = new StringBuilder();
//
//	sql.append("UPDATE assinatura_do_cliente SET id_plano = ?, id_usuario = ? WHERE id_assinatura = ?");
//
//	PreparedStatement ps; // 
//
//	boolean retorno = true;
//
//
//	try {
//		ps = cnx.prepareStatement(sql.toString());
//
//
//
//
//		
//		ps.setInt(1, assinatura.getPlanoCliente().getId_plano());
//		ps.setInt(2, assinatura.getUsuario().getId_usuario());
//		ps.setInt(3, assinatura.getId_assinatura());
//		
//
//
//		ps.execute();
//		ps.close();
//		cnx.close();
//
//
//	}
//	catch (SQLException e) {
//		e.printStackTrace();
//		retorno = false;
//	} 
//	return retorno;
//}

	
	
}
