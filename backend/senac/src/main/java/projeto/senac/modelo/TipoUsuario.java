package projeto.senac.modelo;

public class TipoUsuario extends Endereco{

	private int id_tipo;
	private String descricao_tipo;
	
	public TipoUsuario(int id_tipo, String descricao_tipo) {
		super();
		this.id_tipo = id_tipo;
		this.descricao_tipo = descricao_tipo;
	}


	
	public TipoUsuario() {
		// TODO Auto-generated constructor stub
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public TipoUsuario setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
		return null;
	}

	public String getDescricao_tipo() {
		return descricao_tipo;
	}

	public void setDescricao_tipo(String descricao_tipo) {
		this.descricao_tipo = descricao_tipo;
	}



	
	
	
	
	
}
