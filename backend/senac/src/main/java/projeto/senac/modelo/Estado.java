package projeto.senac.modelo;

public class Estado  {

	private int id_estado;
	private String descricao_estado;
	private String uf; // mudei para varchar no banco de dados
	
	public Estado(int id_estado, String descricao_estado, String uf) {
		super();
		this.id_estado = id_estado;
		this.descricao_estado = descricao_estado;
		this.uf = uf;
	}

	public Estado() {
		// TODO Auto-generated constructor stub
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getDescricao_estado() {
		return descricao_estado;
	}

	public void setDescricao_estado(String descricao_estado) {
		this.descricao_estado = descricao_estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
}
