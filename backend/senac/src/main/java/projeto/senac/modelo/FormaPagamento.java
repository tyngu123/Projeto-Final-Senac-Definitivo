package projeto.senac.modelo;

public class FormaPagamento {

	private int id_forma_pagamento;
	private Cartao cartao;
	private Pix pix;
	
	public FormaPagamento(int id_forma_pagamento) {
		super();
		this.id_forma_pagamento = id_forma_pagamento;
	}

	public int getId_forma_pagamento() {
		return id_forma_pagamento;
	}

	public void setId_forma_pagamento(int id_forma_pagamento) {
		this.id_forma_pagamento = id_forma_pagamento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Pix getPix() {
		return pix;
	}

	public void setPix(Pix pix) {
		this.pix = pix;
	}
	
	
	
}
