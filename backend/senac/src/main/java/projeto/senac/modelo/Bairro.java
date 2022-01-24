package projeto.senac.modelo;

public class Bairro extends Municipio{

	private int id_bairro;
	private String descricao_bairro;
	
	public Bairro(int id_bairro, String descricao_bairro) {
		super();
		this.id_bairro = id_bairro;
		this.descricao_bairro = descricao_bairro;
	}

	public Bairro() {
		// TODO Auto-generated constructor stub
	}

	public int getId_bairro() {
		return id_bairro;
	}

	public void setId_bairro(int id_bairro) {
		this.id_bairro = id_bairro;
	}

	public String getDescricao_bairro() {
		return descricao_bairro;
	}

	public void setDescricao_bairro(String descricao_bairro) {
		this.descricao_bairro = descricao_bairro;
	}
}
