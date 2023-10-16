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
- Aluno
<h3>HashPai</h3>

A classe HashPai é uma classe abstrata que serve como base para as classes Hash1 e Hash2.  Esta classe define algumas propriedades fundamentais e métodos que são comuns às tabelas hash, porém deixa os detalhes específicos de inserção, busca e remoção para serem definidos em suas subclasses. Seus atributos são:
- tamanho
- n_elementos
- fator_carga

<h3>Hash1</h3>

Essa classe permite inserir um aluno na tabela usando sua matrícula ou ID como chave, buscar um aluno pelo seu identificador (matrícula ou ID), e remover um aluno com base nesse identificador. Em caso de colisões durante a inserção, a classe tenta encontrar uma posição alternativa, e se a tabela ficar muito carregada, ela é automaticamente expandida para o dobro de seu tamanho, re-inserindo os alunos existentes na nova tabela ampliada.

<h4>Inserção:</h4>

O método de inserção coloca um novo objeto Aluno na tabela hash. Se a matrícula do aluno não estiver definida, o ID é usado como chave. Se houver uma colisão (dois alunos destinados à mesma posição), o método procura uma posição vazia subsequente. Se a tabela estiver próxima da sua capacidade máxima, ela será automaticamente expandida.
<br/>
Hash1:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/ddc92ec5-a583-42bc-8218-5c42c491e725)
<br/>
Hash2:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/e14d0e05-aede-458c-8424-7a2b69d66e2e)


<h4>Busca:</h4>

O método de busca localiza um objeto Aluno na tabela hash com base em um identificador, que pode ser a matrícula ou o ID do aluno, dependendo do valor do parâmetro booleano id. Caso o aluno com o identificador fornecido não seja encontrado, retorna null.
<br/>
Hash1:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/401cba15-a313-471b-af86-67c6d944d69a)
<br/>
Hash2:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/1f1e2ccf-2d1b-46c4-976e-4e27a7433333)




<h4>Remoção:</h4>

Este método exclui um Aluno da tabela hash usando o identificador fornecido (matrícula ou ID). Após remover o aluno, ele é retornado pelo método. Se o aluno com o identificador especificado não estiver presente na tabela, o método retorna null.
<br/>
Hash1:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/f2fa5798-dd96-4abf-8c89-ee3f768d7034)
<br/>
Hash2:
<br/>
![image](https://github.com/GustavoLuizFarignoli/Hashmap-EstruturaDados/assets/111205291/186d32fc-3398-48d7-bf69-88fcef9d701c)



<h4>Expansão:</h4>

O método de expansão é invocado quando a tabela hash está próxima da sua capacidade. Ele cria uma nova tabela com o dobro da capacidade, e os alunos da tabela anterior são re-inseridos na nova.

<h3>Hash2</h3>

Assim como a classe Hash1, a classe Hash2 também herda da classe abstrata HashPai e implementa seus métodos abstratos. No entanto, a classe Hash2 utiliza árvores de busca binária para lidar com colisões, o que permite que a tabela de hash lide com colisões de forma mais eficiente

<h3>Aluno</h3>

A classe Aluno serve como uma representação de um aluno, contendo informações essenciais como ID, matrícula e nome. A classe tem dois construtores que permitem criar um objeto Aluno usando um ID ou uma matrícula, com o nome sendo um requisito em ambos os casos. Se construído usando uma matrícula, o ID é inicialmente definido como -1, indicando que não foi fornecido.
