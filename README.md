<h1>Tabela Hash</h1>
PJBL 3 sobre Tabelas Hash em Java, para a diciplina de Resolução de Problemas Estruturados em Computação no 4º periodo do curso de Engenharia de Software na PUCPR. Desenvolvido por Gabriel Molec Nunes, Gustavo Luiz Farignoli e João Gabriel Stresser Trigo.
<br/>
<h2>Intuito do Projeto</h2>
O intuito deste projeto é implementar uma tabela hash em Java utilizando a técnica de encadeamento separado para lidar com colisões.
<br/>
<h2>Principais Classes</h2>
O Código conta com 4 classes principais:</br>
- HashPai <br>
- Hash1 <br>
- Hash2 <br>
- ...
<h3>HashPai</h3>

Lorem ipsum dolor sit amet, consectetur adipiscing elit.

<h3>Hash1</h3>

Essa classe permite inserir um aluno na tabela usando sua matrícula ou ID como chave, buscar um aluno pelo seu identificador (matrícula ou ID), e remover um aluno com base nesse identificador. Em caso de colisões durante a inserção, a classe tenta encontrar uma posição alternativa, e se a tabela ficar muito carregada, ela é automaticamente expandida para o dobro de seu tamanho, re-inserindo os alunos existentes na nova tabela ampliada.

<h4>Inserção:</h4>

O método de inserção coloca um novo objeto Aluno na tabela hash. Se a matrícula do aluno não estiver definida, o ID é usado como chave. Se houver uma colisão (dois alunos destinados à mesma posição), o método procura uma posição vazia subsequente. Se a tabela estiver próxima da sua capacidade máxima, ela será automaticamente expandida.

<h4>Busca:</h4>

O método de busca localiza um objeto Aluno na tabela hash com base em um identificador, que pode ser a matrícula ou o ID do aluno, dependendo do valor do parâmetro booleano id. Caso o aluno com o identificador fornecido não seja encontrado, retorna null.

<h4>Remoção:</h4>

Este método exclui um Aluno da tabela hash usando o identificador fornecido (matrícula ou ID). Após remover o aluno, ele é retornado pelo método. Se o aluno com o identificador especificado não estiver presente na tabela, o método retorna null.

<h4>Expansão:</h4>

O método de expansão é invocado quando a tabela hash está próxima da sua capacidade. Ele cria uma nova tabela com o dobro da capacidade, e os alunos da tabela anterior são re-inseridos na nova.

<h3>Hash2</h3>

Lorem ipsum dolor sit amet, consectetur adipiscing elit.

<h3>...</h3>

Lorem ipsum dolor sit amet, consectetur adipiscing elit.
