import { User } from "./user";

export interface Vagas {
    id_vaga: number;
    usuario: User;
    titulo: string;
    descricao: string;
    salario: number;
    beneficio: string;
    carga_horaria: string;
    estado: string;
    requisitos: string;

}
