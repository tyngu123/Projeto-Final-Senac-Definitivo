package projeto.senac.modelo;

public class Funcionalidade {

	private int id_fun;
	private String fun;
	private String fun_descricao;
	
	public Funcionalidade(int id_fun, String fun, String fun_descricao) {
		super();
		this.id_fun = id_fun;
		this.fun = fun;
		this.fun_descricao = fun_descricao;
	}

	public int getId_fun() {
		return id_fun;
	}

	public void setId_fun(int id_fun) {
		this.id_fun = id_fun;
	}

	public String getFun() {
		return fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	public String getFun_descricao() {
		return fun_descricao;
	}

	public void setFun_descricao(String fun_descricao) {
		this.fun_descricao = fun_descricao;
	}
	
	
	
}