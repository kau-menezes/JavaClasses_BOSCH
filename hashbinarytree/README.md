### Aula 10

Isso é um grafo direcionado. Basicamente são várias vértices (valores numéricos) conectados. Note que as setas indicam quais caminhos podem ser tomados a partir 
da sua posição. O nosso trabalho será usar uma busca, marcando os lugares que visitamos e colocando em um HashSet até encontrar um ciclo. Um ciclo é quando 
podemos sair de um vértice e retornar a ele através de outros. Nem todo grafo tem ciclos, mas pode ser um desafio encontrá-los. Você receberá arquivos como o 
seguinte:

```
1 > 2
2 > 3
3 > 1
```

Que indicam todos os caminhos que podem ser tomados saindo de um vértice e para onde eles vão. No exemplo acima um óbvio ciclo existe. Implemente uma árvore 
binária de busca para garantir uma rápida procura de dados e então use-a para fazer o seu próprio HashMap em Java para conseguir detectar se você está visitando 
um vértice uma segunda vez.
Para fazer a busca coloque todos os vértices que você consegue ver de uma dada posição em uma fila que será explorada. Digamos, estando na posição 7 na 
imagem, você deve por 3 e 5 na fila e então na próxima etapa explorará o vértice 3. Isso se chama busca em largura Note que você deve implementar a sua própria 
fila usando sua própria lista ligada para isso.

> [!TIP]
> O que falta:

- [x] Criar as estruturas neessárias :tada:
- [x] Analisar o grafo e fazer a dinâmica entre eles :tada:
- [ ] Ler os dados do .txt e adicionar ao grafo
