package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.senac.modelo.Cartao;
import projeto.senac.modelo.Cartao.tipo;
import projeto.senac.modelo.FormaPagamento;
import projeto.senac.modelo.PlanoCliente;
import projeto.senac.modelo.Usuario;
import projeto.senac.modelo.Venda;

public class VendaDAO {
	
	public List<Venda> listar(){

		
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from venda v\r\n"
				+ "inner join plano_cliente p \r\n"
				+ "on v.id_plano = p.id_plano\r\n" 
				+ "inner join forma_de_pagamento f\r\n"
				+ "on v.id_forma_pagamento = f.id_forma_pagamento\r\n"
				+ "inner join Cartao c\r\n"
				+ "on f.id_cartao = c.id_cartao;");
		
		PreparedStatement ps; // Statement recebe os comandos do sql e recebe informações 
		
		List<Venda> lista = new ArrayList<Venda>();
		
		Venda v;
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				v = new Venda();
				v.setId_venda(rs.getInt("id_venda"));
				v.setData_venda(rs.getDate("data_venda"));
				v.setValor(rs.getDouble("valor"));
				
				PlanoCliente planoCliente = new PlanoCliente();
				planoCliente.setId_plano(rs.getInt("id_plano"));
				planoCliente.setPlanos(rs.getString("planos"));
				planoCliente.setPlanos_descricao(rs.getString("planos_descricao"));
				planoCliente.setPlanos_preco(rs.getDouble("planos_preco"));
				
			
				
				FormaPagamento formaPagamento = new FormaPagamento();
				formaPagamento.setId_forma_pagamento(rs.getInt("id_forma_pagamento"));
				Cartao cartao = new Cartao();
				cartao.setId_cartao(rs.getInt("id_cartao"));
				cartao.setNumero(rs.getString("numero"));
				cartao.setData_validade(rs.getString("data_validade"));
				cartao.setNome_pessoa(rs.getString("nome_pessoa"));
				cartao.setCvv(rs.getInt("cvv"));
				tipo.valueOf(rs.getString("tipo"));
				cartao.setBanco(rs.getString("banco"));
				
				
				
				formaPagamento.setCartao(cartao);
				
				v.setPlanoCliente(planoCliente);
//				v.setUsuario(usuario);
				v.setFormaPagamento(formaPagamento);
				lista.add(v);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dao.fecharConexao();
			return lista;
		}
		
	}
	
	public boolean cadastrar(Venda venda) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO Cartao(numero, data_validade, nome_pessoa, cvv, banco) VALUES( ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
//			ps.setString(1, cartao.getNumero());
//			ps.setString(2, cartao.getData_validade());
//			ps.setString(3, cartao.getNome_pessoa());
//			ps.setInt(4, cartao.getCvv());
//			ps.setString(5, cartao.getBanco());
//		
			
			
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
}