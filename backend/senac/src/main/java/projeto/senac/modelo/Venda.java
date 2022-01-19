package projeto.senac.modelo;

import java.util.Date;

public class Venda {

	private int id_venda;
	private Date data_venda;
	private AssinaturaCliente assinaturaCliente;
	private double valor;
	private FormaPagamento formaPagamento;
	
	public Venda(int id_venda, Date data_venda, double valor) {
		super();
		this.id_venda = id_venda;
		this.data_venda = data_venda;
		this.valor = valor;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public Date getData_venda() {
		return data_venda;
	}

	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}

	public AssinaturaCliente getAssinaturaCliente() {
		return assinaturaCliente;
	}

	public void setAssinaturaCliente(AssinaturaCliente assinaturaCliente) {
		this.assinaturaCliente = assinaturaCliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
	
	
	
}
