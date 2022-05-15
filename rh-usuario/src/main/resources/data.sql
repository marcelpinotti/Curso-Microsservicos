INSERT INTO tb_usuarios (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_usuarios (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_funcoes (funcao) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_funcoes (funcao) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuarios_funcoes (usuario_id, funcao_id) VALUES (1, 1);
INSERT INTO tb_usuarios_funcoes (usuario_id, funcao_id) VALUES (2, 1);
INSERT INTO tb_usuarios_funcoes (usuario_id, funcao_id) VALUES (2, 2);