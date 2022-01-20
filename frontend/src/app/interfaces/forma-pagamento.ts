import { Cartao } from "./cartao";
import { Pix } from "./pix";

export interface FormaPagamento {
    id_forma_pagamento: number;
    cartao: Cartao;
    pix: Pix;
    
}
