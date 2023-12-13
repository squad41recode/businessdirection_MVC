CREATE DATABASE IF NOT EXISTS business_direction_DB;

use business_direction_DB;

insert into empreendedor (nome,sobrenome,email,telefone,data_nascimento, cidade, estado,nome_empresa) 
values 	('Maria', 'Silva','maria@gmail.com', '99999999999','2000-02-20','São Paulo', 'SP','EmpresaNome'),
		('Joao', 'Ferreira','Joao@gmail.com', '99999999999','1999-02-20','Rio de Janeiro', 'RJ','EmpresaNome'),
		('Ana', 'Maia','ana@gmail.com', '99999999999','1980-02-20','Recife', 'PE','EmpresaNome'),
		('Jose', 'Souza','jose@gmail.com', '99999999999','1973-02-20','Aracaju', 'SE','EmpresaNome'),
		('Marcelo', 'Pereira','marcelo@gmail.com','99999999999','1995-02-20','São Paulo', 'SP','EmpresaNome');

select * from empreendedor;

insert into mentor (nome,sobrenome,email,whatsapp,data_nascimento, tipo_experiencia) 
values 	('Maria', 'Mentora','maria@gmail.com', '99999999999','2000-02-20', 'exemplo experiencia'),
('Joao', 'Mentor','joao@gmail.com', '99999999999','2000-02-20', 'exemplo experiencia'),
('Ana', 'Mentora','ana@gmail.com', '99999999999','2000-02-20', 'exemplo experiencia'),
('Jose', 'Mentor','joao@gmail.com', '99999999999','2000-02-20', 'exemplo experiencia'),
('Paulo', 'Mentor','paulo@gmail.com', '99999999999','2000-02-20', 'exemplo experiencia');

select * from mentor;

insert into modalidade_mentoria (nome_modalidade)
values ('nome modalidade 01'),('nome modalidade 02'),('nome modalidade 03'),('nome modalidade 04'),('nome modalidade 05');

select * from modalidade_mentoria;

insert into conteudo_online (conteudo,fk_modalidade_mentoria_id)
values ('conteudo 01',2),('conteudo 02',4),('conteudo 03',3),('conteudo 04',1),('conteudo 05',5);

select * from conteudo_online;

SHOW CREATE TABLE empreendedor_mentoria;

select * from empreendedor_mentoria;

insert into mentor_modalidade (dia_semana, horario,fk_mentor_id,fk_modalidade_mentoria_id)
values ('Segunda-banco', '11:11', 3,3);

select * from mentor_modalidade;

select * from mentor_modalidade e where m.empreendedor.id not like fk_empreendedor_id;

SELECT mm FROM MentorModalidade mm  WHERE mm.id NOT IN (SELECT em.mentorModalidade.id FROM EmpreendedorMentoria em WHERE em.empreendedor.id = empreendedor.d);

select * from conteudo_empreendedor;

INSERT INTO business_direction_db.conteudo_empreendedor (data_fim, data_inicio, status, fk_conteudo_online_id, fk_empreendedor_id) VALUES ('2023-11-20', '2023-11-01', 'Em progresso', '1', '1');

