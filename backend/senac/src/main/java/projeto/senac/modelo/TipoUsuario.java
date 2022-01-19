package projeto.senac.modelo;

public class TipoUsuario {

	private int id_tipo;
	private String descricao;
	
	public TipoUsuario(int id_tipo, String descricao) {
		super();
		this.id_tipo = id_tipo;
		this.descricao = descricao;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
