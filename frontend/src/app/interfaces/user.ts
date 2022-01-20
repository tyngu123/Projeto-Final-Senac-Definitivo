import { Endereco } from "./endereco";
import { TipoDoc } from "./tipo-doc";
import { TipoUser } from "./tipo-user";

export interface User {
    id_usuario: number;
    nome_completo: string;
    apelido: string;
    nascimento: Date;
    documento: string;
    tipoDocumento: TipoDoc;
    endereco: Endereco;
    email: string;
    senha: string;
    tipoUsuario: TipoUser;

}
