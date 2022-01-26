package projeto.senac.modelo;

public class Vaga {

	private int id_vagas;
	private Usuario usuario;
	private String titulo;
	private String descricao;
	private double salario;
	private String beneficio;
	private String carga_horaria;
	private Estado estado;
	private String requisitos;
	
	public Vaga(int id_vagas, String titulo, String descricao, double salario, String beneficio, String carga_horaria,
			 String requisitos) {
		super();
		this.id_vagas = id_vagas;
		this.titulo = titulo;
		this.descricao = descricao;
		this.salario = salario;
		this.beneficio = beneficio;
		this.carga_horaria = carga_horaria;
		
		this.requisitos = requisitos;
	}

	public Vaga() {
		// TODO Auto-generated constructor stub
	}

	public int getId_vagas() {
		return id_vagas;
	}

	public void setId_vagas(int id_vagas) {
		this.id_vagas = id_vagas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public String getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	
	
	
	
}