### Desafio aula 04 

Crie um cadastro para um sistema de ponto a ser utilizado em uma empresa. Para isso, seu sistema precisará armazenar um vetor de empregados. O Empregado
possui Nome, Cpf, Data de Nascimento, Senha e se ele é o administrador.
Para bater o ponto o empregado deve apenas digitar no sistema seu Cpf, com ou sem pontos, sua senha de 6 caracteres, data e hora para ser armazenados no
sistema. Para isso você precisará de uma classe Ponto que recebe o Cpf do empregado a data do ponto e o horário de início ou término do trabalho. Não precisa
indicar se foi início ou término: O primeiro ponto do dia é entrada e o segundo é saída. Além disso, para o horário você só precisa de minuto e hora.
Caso seja o administrador a abrir o ponto, deve ser possível que o mesmo escolha entre cadastrar um novo empregado, listar os empregados ou mostrar quantas
horas um empregado trabalhou em um determinado mês, digitando seu Cpf, mês e ano.
Use do encapsulamento para impedir que operações sejam usadas indevidamente.
Faça uma lista ligada para armazenar os registros e empregados da empresa.