package projeto.senac.modelo;

public class TipoDocumento {

	private int id_documento;
	private String descricao;
	
	public TipoDocumento(int id_documento, String descricao) {
		super();
		this.id_documento = id_documento;
		this.descricao = descricao;
	}

	public TipoDocumento() {
		// TODO Auto-generated constructor stub
	}

	

	public int getId_documento() {
		return id_documento;
	}

	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}