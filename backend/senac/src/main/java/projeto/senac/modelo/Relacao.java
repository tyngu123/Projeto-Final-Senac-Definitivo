package projeto.senac.modelo;

public class Relacao {

	private int id_relacao;
	private TipoUsuario tipoUsuario;
	private Funcionalidade funcionalidade;
	private PlanoCliente planoCliente;
	
	public Relacao(int id_relacao) {
		super();
		this.id_relacao = id_relacao;
	}

	public int getId_relacao() {
		return id_relacao;
	}

	public void setId_relacao(int id_relacao) {
		this.id_relacao = id_relacao;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public PlanoCliente getPlanoCliente() {
		return planoCliente;
	}

	public void setPlanoCliente(PlanoCliente planoCliente) {
		this.planoCliente = planoCliente;
	}
	
	
	
}
