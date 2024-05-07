### Listas e genéricos

Agora é sua vez. Use a nossa classe List genérica como base para implementar a classe Stack (sim, que nem a estrutura do Java). Stack é uma
pilha e ela funciona desta maneira, como uma pilha de roupas. Você coloca e tira coisas apenas do topo, nunca debaixo. Ela possui os seguintes
componentes:

push: Adiciona um valor ao topo da pilha
pop: Remove e retorna o valor no topo da pilha
peek: Retorna, sem remover, o valor no topo da pilha
size: Tamanho da pilha

Depois disso implementaremos a queue - uma fila. Na fila, entram coisas de um lado e se retiram do outro:

enqueue: Adiciona um valor no início da fila
dequeue: Remove e retorna o valor no final da fila
peek: Retorna, sem remover, o valor no final da fila
size: Tamanho da fila

Importante: Para implementa ruma stack nós podemos usar a mesma implementação do array dinâmico, mas para queue é melhor uma lista
ligada.