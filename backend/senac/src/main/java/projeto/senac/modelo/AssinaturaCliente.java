package projeto.senac.modelo;

public class AssinaturaCliente {

	private int id_assinatura;
	private Usuario usuario;
	private PlanoCliente planoCliente;
	
	public AssinaturaCliente(int id_assinatura) {
		super();
		this.id_assinatura = id_assinatura;
	}

	public AssinaturaCliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId_assinatura() {
		return id_assinatura;
	}

	public void setId_assinatura(int id_assinatura) {
		this.id_assinatura = id_assinatura;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PlanoCliente getPlanoCliente() {
		return planoCliente;
	}

	public void setPlanoCliente(PlanoCliente planoCliente) {
		this.planoCliente = planoCliente;
	}
	
	
	
	
}
