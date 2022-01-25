package projeto.senac.modelo;

import java.util.Date;

public class Venda {

	private int id_venda;
	private Date data_venda;
	private PlanoCliente planoCliente;
	private double valor;
	private Usuario usuario;
	private FormaPagamento formaPagamento;
	
	public Venda(int id_venda, Date data_venda, double valor) {
		super();
		this.id_venda = id_venda;
		this.data_venda = data_venda;
		this.valor = valor;
	}

	public Venda() {
		// TODO Auto-generated constructor stub
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

	public PlanoCliente getPlanoCliente() {
		return planoCliente;
	}

	public void setPlanoCliente(PlanoCliente planoCliente) {
		this.planoCliente = planoCliente;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
}