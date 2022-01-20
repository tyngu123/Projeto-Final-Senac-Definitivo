import { Estado } from "./estado";

export interface Municipio {
    id_municipio: number;
    descricao: string;
    estado: Estado;
}
