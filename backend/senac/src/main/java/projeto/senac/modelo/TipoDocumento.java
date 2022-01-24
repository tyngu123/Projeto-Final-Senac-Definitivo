package projeto.senac.modelo;

public class TipoDocumento extends TipoUsuario{

	private int id_documento;
	private String descricao_documento;
	
	public TipoDocumento(int id_documento, String descricao_documento) {
		super();
		this.id_documento = id_documento;
		this.descricao_documento = descricao_documento;
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

	public String getDescricao_documento() {
		return descricao_documento;
	}

	public void setDescricao_documento(String descricao_documento) {
		this.descricao_documento = descricao_documento;
	}
}
