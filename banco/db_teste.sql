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

