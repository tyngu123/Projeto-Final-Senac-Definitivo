import { AssinaturaCliente } from "./assinatura-cliente";
import { FormaPagamento } from "./forma-pagamento";
import { PlanoCliente } from "./plano-cliente";

export interface Venda {
    id_vaga: number;
    data_venda: Date;
    assinatura: PlanoCliente;
    valor: PlanoCliente;
    formaPagamento: FormaPagamento;
    
}
