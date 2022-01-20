import { Bairro } from "./bairro";
import { Logradouro } from "./logradouro";
import { Municipio } from "./municipio";

export interface Endereco {
    id_endereco: number;
    logradouro: Logradouro;
    bairro: Bairro;
    municipio: Municipio;
    cep: string;
    numero: number;
    complemento?: string;
}
