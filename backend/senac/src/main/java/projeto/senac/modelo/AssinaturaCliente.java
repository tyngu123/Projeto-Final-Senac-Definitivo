package projeto.senac.modelo;

public class AssinaturaCliente {

	private int id_ass_cli;
	private Usuario usuario;
	private PlanoCliente planoCliente;
	
	public AssinaturaCliente(int id_ass_cli) {
		super();
		this.id_ass_cli = id_ass_cli;
	}

	public int getId_ass_cli() {
		return id_ass_cli;
	}

	public void setId_ass_cli(int id_ass_cli) {
		this.id_ass_cli = id_ass_cli;
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
