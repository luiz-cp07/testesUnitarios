# testesUnitarios


Testes Unitários

Os testes unitários se encontram na base da pirâmide de testes, os mesmos são responsáveis por testar a menor unidade do software desenvolvida. E por estaram na base da pirâmide podemos ddizer que são testes mais rápidos e mais mais baratos de se fazer.

Ferramentas utlizadas: Intellij IDE e JUnit (Importante adicionar a dependência JUnit no arquivo pom.xml)

No pacote testeUnitario em src/main/java: Criação da classe CalculoMedia com nota1 e nota2; Criação dos gets e sets; Criação de um construtor instanciar a classe informando os valores das notas um e dois; Criação de outro construtor onde não é informado nada (Nesse caso temos iremos usar os dois sets criados); Criação do método getSituação do tipo String (Responsável por realizar a soma das duas notas e então é garantir que se a soma das duas notas do aluno for menor que 60 ele está 'Reprovado', e caso contrário ele está 'Aprovado');

No pacote testeUnitario src/test/java: Criação da classe TesteCalculoMedia; Criação do método testeReprovado, chamar a classe CalculoMedia, selecionar o construtor e informar os valores das duas notas; Fazer a verificação utilizando o assertEquals, no teste estamos esperando por "Reprovado" e chamo o método getSitação que irá retornar o valor; Executar o teste através do JUnit Test, e ao executar verifico que o irá passar (para sabermos a cobertura do nosso teste basta clicar com o botão direito no nosso teste e selecionar a opção "Run 'TesteCalculoMedia' with Coverage"); Após a execução podemos ver as porcetagens de cobertura que o nosso teste criado está cobrindo (No nosso caso foi possível observar que ainda não tivemos uma cobertura legal. Vamos realizar a criação de mais um método para tentar melhorar a cobertura do nosso teste; Criação do método testeAprovado, chamar a classe CalculoMedia a qual não foi informado nada, passar os valores das notas pelo sets; Agora estamos esperando por "Aprovado", vamos chamar o método getSitação que irá retornar o valor; Executar o teste através do JUnit Test, e ao executar verifico que o teste irá passar (Para sabermos a cobertura do teste seleciono a opção "Run 'TesteCalculoMedia' with Coverage"); Ao validar a cobertura dos nossos testes criados podemos observar que estamos com 100% de cobertura.
