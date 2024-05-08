### Aula 8

Em 2017 Nicky Case criou um jogo para estudar a Teoria dos Jogos que ficou popular no YouTube e redes sociais. The Evolution of Trust é um jogo onde analisamos 
como a sociedade se comporta e como ela evolui diante de exercícios de confiança que acontecem no dia-a-dia. Neste desafio iremos implementar uma versão 
semelhante ao jogo de Nicky Case que estudará a sobrevivência da sociedade perante as oportunidades de cooperação.
Iremos implementar um sistema de prosperidade que funciona da seguinte forma:

Existe uma população mundial que começa com uma quantidade qualquer de indivíduos
Cada indivíduo começa com 10 moedas
Indivíduos podem interagir, representando uma oportunidade de cooperar

Quando indivíduos interagem o seguinte processo acontece:

Eles devem escolher colocar ou não uma moeda em uma máquina
Se um indivíduo coloca a moeda na máquina, o mesmo perderá a moeda
Se ambos colocarem a moeda da máquina, ou seja, cooperarem, ambos ganham duas moedas
Se algum deles trapacear, não colocando a moeda na máquina, mas o outro indivíduo colocar, o trapaceiro ganha 4 moedas
Se ambos trapacearem, ninguém ganha moeda alguma

Em cada rodada os indivíduo irão interagir da seguinte forma:
A escolha dos indivíduos que vão interagir podendo ou não cooperar é aleatória
Numa única rodada ocorre 1 interação para cada 2 indivíduos
Alguns indivíduos tem a oportunidade de interagir mais de uma vez, outros nenhuma
No final da rodada todos os indivíduos perdem 1 moeda como custo de sobrevivência
Todo indivíduo tem 10% de chance de perder uma moeda por puro azar
Se algum indivíduo não puder pagar o custo de sobrevivência, ele morre e sai do jogo
Após isso, se algum indivíduo obter 20 moedas, ele se clona dividindo suas moedas entre ele e seu novo clone
Se restar apenas um indivíduo, considere o fim do jogo com a morte do mesmo

Acompanhe a população mundial para ver se o planeta prospera ou perece.

Para isso você deve implementar a classe Mundo, que controla o fluxo acima e a classe indivíduo. A classe indivíduo deve ter um método que decide se o mesmo vai 
cooperar ou trapacear. Além de conter as moedas do mesmo. Os indivíduos não podem saber quem vão interagir, mas podem saber o resultado depois.

Como subclasses da classe indivíduo você deve ter algumas implementações:

Colaborativo: Sempre Coopera
Trapaceiro: Sempre Trapaceia
Rabugento: Sempre Coopera, até ser trapaceado, a partir dai sempre trapaceará
Copiador: Copia o comportamento do adversário no último round
Tolerante: Coopera quase sempre, mas se for enganado 3 vezes trapaceará nas próximas 3 oportunidades, depois reiniciará ao estado inicial
Invente qualquer pessoa tipo de indivíduo que você queira testar

Monte populações mistas dos tipos que você criou e teste buscando ver se as populações vão ser prosperas, estáveis ou vão acabar por se autodestruir.