insert into veiculo (nome, fator_multiplicador) values ('Caminhão caçamba', 1.05);
insert into veiculo (nome, fator_multiplicador) values ('Carreta', 1.12);
insert into veiculo (nome, fator_multiplicador) values ('Caminhão baú', 1.00);

insert into tipo_rodovia (codigo, nome, custo_km) values ('P', 'Pavimentada', 0.54);
insert into tipo_rodovia (codigo, nome, custo_km) values ('N', 'Não-pavimentada', 0.62);

insert into parametro (nome, valor, descricao) values ('CARGA_EXCEDENTE_LIMTE', '5', 'Limite de carga excedente em toneladas');
insert into parametro (nome, valor, descricao) values ('CARGA_EXCEDENTE_CUSTO', '0.02', 'Custo da carga excedente');
