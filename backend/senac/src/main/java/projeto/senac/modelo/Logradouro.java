package projeto.senac.modelo;

public class Logradouro {

	private int id_logradouro;
	private String descricao;
	
	public Logradouro(int id_logradouro, String descricao) {
		super();
		this.id_logradouro = id_logradouro;
		this.descricao = descricao;
	}

	public int getId_logradouro() {
		return id_logradouro;
	}

	public void setId_logradouro(int id_logradouro) {
		this.id_logradouro = id_logradouro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
