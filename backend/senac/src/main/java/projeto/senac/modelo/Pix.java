package projeto.senac.modelo;

public class Pix {
	
	private int id_pix;
	private String nome_beneficiario;
	private String chave_pix;
	
	public Pix(int id_pix, String nome_beneficiario, String chave_pix) {
		super();
		this.id_pix = id_pix;
		this.nome_beneficiario = nome_beneficiario;
		this.chave_pix = chave_pix;
	}

	public int getId_pix() {
		return id_pix;
	}

	public void setId_pix(int id_pix) {
		this.id_pix = id_pix;
	}

	public String getNome_beneficiario() {
		return nome_beneficiario;
	}

	public void setNome_beneficiario(String nome_beneficiario) {
		this.nome_beneficiario = nome_beneficiario;
	}

	public String getChave_pix() {
		return chave_pix;
	}

	public void setChave_pix(String chave_pix) {
		this.chave_pix = chave_pix;
	}
	
	
	
	
}