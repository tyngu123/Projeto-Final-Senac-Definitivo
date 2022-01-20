import { PlanoCliente } from "./plano-cliente";
import { User } from "./user";

export interface AssinaturaCliente {
    id_assinatura: number;
    usuario: User;
    plano: PlanoCliente;
    
}
