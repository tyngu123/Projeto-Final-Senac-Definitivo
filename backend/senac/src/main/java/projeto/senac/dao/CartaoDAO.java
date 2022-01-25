package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projeto.senac.modelo.Cartao;

public class CartaoDAO {

	public boolean cadastrar(Cartao cartao) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO Cartao(numero, data_validade, nome_pessoa, cvv, banco) VALUES( ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			
			ps.setString(1, cartao.getNumero());
			ps.setString(2, cartao.getData_validade());
			ps.setString(3, cartao.getNome_pessoa());
			ps.setInt(4, cartao.getCvv());
			ps.setString(5, cartao.getBanco());
		
			
			
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
