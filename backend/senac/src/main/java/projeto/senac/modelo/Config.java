package projeto.senac.modelo;

public class Config {

	private int id_config;
	private String termo;
	
	public Config(int id_config, String termo) {
		super();
		this.id_config = id_config;
		this.termo = termo;
	}

	public int getId_config() {
		return id_config;
	}

	public void setId_config(int id_config) {
		this.id_config = id_config;
	}

	public String getTermo() {
		return termo;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}
	
	
	
	
}
