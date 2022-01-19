package projeto.senac.modelo;

public class PlanoCliente {
	
	private int id_assinatura;
	private String planos;
	private String planos_descricao;
	private double planos_preco;
	
	public PlanoCliente(int id_assinatura, String planos, String planos_descricao, double planos_preco) {
		super();
		this.id_assinatura = id_assinatura;
		this.planos = planos;
		this.planos_descricao = planos_descricao;
		this.planos_preco = planos_preco;
	}

	public int getId_assinatura() {
		return id_assinatura;
	}

	public void setId_assinatura(int id_assinatura) {
		this.id_assinatura = id_assinatura;
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
