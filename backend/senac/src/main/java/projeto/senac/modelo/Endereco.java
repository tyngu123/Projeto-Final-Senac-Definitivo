package projeto.senac.modelo;

public class Endereco {
	
	private int id_endereco;
	private Logradouro logradouro;
	private String nome_rua;
	private Bairro bairro;
	private Municipio municipio;
	private String cep;
	private int numero;
	private String complemento;
	
	public Endereco(int id_endereco, String nome_rua, String cep, int numero, String complemento) {
		super();
		this.id_endereco = id_endereco;
		this.nome_rua = nome_rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome_rua() {
		return nome_rua;
	}

	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
