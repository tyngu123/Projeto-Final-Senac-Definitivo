import { AssinaturaCliente } from "./assinatura-cliente";
import { FuncionalidadePlano } from "./funcionalidade-plano";
import { TipoUser } from "./tipo-user";

export interface Relacao {
    id_relacao: number;
    tipoUsuario: TipoUser;
    fun: FuncionalidadePlano;
    assinatura: AssinaturaCliente;
    
}
