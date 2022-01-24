package projeto.senac.modelo;

public class Logradouro extends Bairro{

	private int id_logradouro;
	private String descricaoLog;
	
	public Logradouro(int id_logradouro, String descricaoLog) {
		super();
		this.id_logradouro = id_logradouro;
		this.descricaoLog = descricaoLog;
	}

	public Logradouro() {
		// TODO Auto-generated constructor stub
	}

	public int getId_logradouro() {
		return id_logradouro;
	}

	public void setId_logradouro(int id_logradouro) {
		this.id_logradouro = id_logradouro;
	}

	public String getDescricaoLog() {
		return descricaoLog;
	}

	public void setDescricaoLog(String descricaoLog) {
		this.descricaoLog = descricaoLog;
	}
	
	
}
