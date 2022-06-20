-- Selecione o login e a senha do Usuário cujo id é igual a 3 π  σ
-- R1 <-- σ id = 3 (tb_usuarios)
-- R2 <-- π login_user, senha (R1)

-- Selecione os cursos iniciados pelo usuário de id 1
-- R1 <-- tb_usuarios |x|  tb_usuarios.id = cursos_andamento.usuarios_id (cursos_andamento)
-- R2 <-- tb_cursos |x| tb_cursos.id = R1.cursos_id (R1)
-- R3 <-- σ tb_usuarios.id = 1 (R2)
-- R4 <-- π tb_cursos.nome (R3)

-- Selecione Todos os cards de tipo Exercício existentes no módulo de id 10;
-- R1 <-- tb_cards |x| tb_cards.modulos_id = tb_modulos.id (tb_modulos) 
-- R2 <-- σ tipo = 'Exercício' (R1)
-- R3 <-- π tb_cards.nome (R2)

--Selecione todos os dados de todos os usuários que utilizam a meta de id 1
-- R1 <-- tb_usuarios |x| tb_usuarios.metas_id = tb_metas.id (tb_metas)
-- R2 <-- π tb_usuarios.id, email, senha, login, nome_completo (R1)

--
