USE db_projeto_final;

select * from usuario;

select * from usuario u
join tipo_usuario t
on u.id_tipo = t.id_tipo;

select * from plano_cliente;

select * from funcionalidade;

-- Puxando por free
select * from usuario u
join relacao r
on u.id_tipo = r.id_tipo
join tipo_usuario t
on r.id_tipo= t.id_tipo
join funcionalidade f
on f.id_fun = r.id_fun
where t.descricao = 'Free';

-- puxando por premium
select * from usuario u
join relacao r
on u.id_tipo = r.id_tipo
join tipo_usuario t
on r.id_tipo= t.id_tipo
join funcionalidade f
on f.id_fun = r.id_fun
where t.descricao = 'Premium';


select* from empresa e
join tipo_usuario t
on e.id_tipo = t.id_tipo
join assinatura_do_cliente a
on e.id_empresa = a.id_empresa
join plano_cliente p
on p.id_assinatura = a.id_assinatura;

select *from empresa;





-- Puxando pelo nome
select * from usuario u
join relacao r
on u.id_tipo = r.id_tipo
join tipo_usuario t
on r.id_tipo= t.id_tipo
join funcionalidade f
on f.id_fun = r.id_fun
WHERE u.nome = 'jose';

select * from assinatura_do_cliente;


select * from usuario u
join tipo_usuario t
on u.id_tipo = t.id_tipo
order by u.id_usuario;

-- todos usuarios do banco
select * from usuario;

select * from usuario u
join tipo_usuario tu
on tu.id_tipo = u.id_tipo
join tipo_documento td
on td.id_documento = u.id_documento;



select * from logradouro;

select * from endereco e
join municipio m
on m.id_municipio = e.id_municipio
join bairro b
on e.id_bairro = b.id_bairro
join estado d
on m.id_estado = d.id_estado;


select * from plano_cliente

drop database db_projeto_final;