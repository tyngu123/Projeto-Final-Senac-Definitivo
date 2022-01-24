package projeto.senac.modelo;

public class PlanoCliente extends Usuario {
	
	private int id_plano;
	private String planos;
	private String planos_descricao;
	private double planos_preco;
	
	public PlanoCliente(int id_plano, String planos, String planos_descricao, double planos_preco) {
		super();
		this.id_plano = id_plano;
		this.planos = planos;
		this.planos_descricao = planos_descricao;
		this.planos_preco = planos_preco;
	}

	public int getId_plano() {
		return id_plano;
	}

	public void setId_plano(int id_plano) {
		this.id_plano = id_plano;
	}

	public String getPlanos() {
		return planos;
	}

	public void setPlanos(String planos) {
		this.planos = planos;
	}

	public String getPlanos_descricao() {
		return planos_descricao;
	}

	public void setPlanos_descricao(String planos_descricao) {
		this.planos_descricao = planos_descricao;
	}

	public double getPlanos_preco() {
		return planos_preco;
	}

	public void setPlanos_preco(double planos_preco) {
		this.planos_preco = planos_preco;
	}
	
	
	
}
