package projeto.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projeto.senac.modelo.Endereco;

public class EnderecoDAO {

	public boolean cadastrar(Endereco endereco) {
		Connection cnx = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("INSERT INTO endereco( id_logradouro,nome_rua, id_bairro, id_municipio, CEP, numero, complemento)VALUES( ?, ?, ?, ?, ?, ?, ?);");
		
		PreparedStatement ps; // 
		
		boolean retorno = true;
		
		
		try {
			ps = cnx.prepareStatement(sql.toString());
			
			
			
			ps.setInt(1, endereco.getLogradouro().getId_logradouro());
			ps.setString(2, endereco.getNome_rua());
			ps.setInt(3, endereco.getBairro().getId_bairro());
			ps.setInt(4, endereco.getMunicipio().getId_municipio());
			ps.setString(5, endereco.getCep());
			ps.setInt(6, endereco.getNumero());
			ps.setString(7, endereco.getComplemento());
			
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
