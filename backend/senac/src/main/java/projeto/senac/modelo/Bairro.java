package projeto.senac.modelo;

public class Bairro {

	private int id_bairro;
	private String descricao;
	
	public Bairro(int id_bairro, String descricao) {
		super();
		this.id_bairro = id_bairro;
		this.descricao = descricao;
	}

	public int getId_bairro() {
		return id_bairro;
	}

	public void setId_bairro(int id_bairro) {
		this.id_bairro = id_bairro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
