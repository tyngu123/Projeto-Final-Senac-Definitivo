package projeto.senac.modelo;

public class Cartao {

	private int id_cartao;
	private String numero;
	private String data_validade;
	private String nome_pessoa;
	private int cvv;
	private enum tipo {Credito, Debito};
	private String banco;
	
	public Cartao(int id_cartao, String numero, String data_validade, String nome_pessoa, int cvv, String banco) {
		super();
		this.id_cartao = id_cartao;
		this.numero = numero;
		this.data_validade = data_validade;
		this.nome_pessoa = nome_pessoa;
		this.cvv = cvv;
		this.banco = banco;
	}

	public int getId_cartao() {
		return id_cartao;
	}

	public void setId_cartao(int id_cartao) {
		this.id_cartao = id_cartao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData_validade() {
		return data_validade;
	}

	public void setData_validade(String data_validade) {
		this.data_validade = data_validade;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	
}
