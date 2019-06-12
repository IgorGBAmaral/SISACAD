# Sistema de gerenciamento de pessoas

## Proposta
Desenvolver uma modelagem UML usando Astah e um software utilizando linguagem Java, atendendo às seguintes especificações:
> Sua organização desenvolverá um sistema de controle institucional em uma instituição de ensino, o SISACAD, e você será o responsável pelo desenvolvimento de um protótipo mínimo viável.

> O sistema será utilizado por professores, alunos e funcionários administrativos. Veja a definição das classes abaixo. Os campos em negrito são obrigatórios para instanciar o objeto:

- Aluno
- Professor
- Administrativo
- nome (string)
- cpf (string)
- matricula (string)
- cursos (lista de Curso)
- nome (string)
- cpf (string)
- matricula (string)
- salario (double)
- cursos (lista de Curso)
- nome (string)
- cpf (string)
- matricula (string)
- salario (double)

> O salário de professores e funcionários não pode ser menor do que zero. Deve ser disparada uma exceção SalarioInvalidoException em cenários onde houver tentativa de atribuir salário negativo. Crie esta classe de exceção.

> O salário de professor é um double calculado como o montante do total de horas de seus cursos vezes o valor da hora-aula, que deve valer 50.

> O salário de funcionário administrativo é um double.

> Também deverá ser criada a classe Curso, que só precisa de nome (string) e duração em horas (int).

> Todas as classes devem implementar a interface Comparable, comparando os itens por nome, colocando-os na ordem alfabética.

> Todas as classes devem possuir o método toString, da classe Object, que imprime todos os dados do objeto: nome, cpf e matricula para qualquer tipo de pessoa, cursos para alunos, cursos e salario para professores e salario para administrativos.

> Tenha em mente que uma pessoa do sistema precisa ser Aluno, Professor ou Administrativo. Elas devem ser subclasses de uma classe Pessoa, que não admite instanciação. Pessoa não deve possuir um construtor padrão.
> Aplique os conceitos de herança e polimorfismo, dado que será possível consultar uma pessoa (seja aluno, professor ou funcionário) buscando pela matrícula no sistema.

## Modelagem UML

Deve ser criada modelagem UML do sistema, contendo:

- Diagrama de classes de especificação
- Diagrama de casos de uso para o ator Admin, que realiza todas as operações propostas
- Diagrama de pacotes
- Diagramas de sequências para os casos de uso:
- Consultar dados de uma pessoa
- Cadastrar novo aluno
- Sistema

Caso de Uso a programar:

- Consultar dados de uma pessoa
- Sistema solicita uma matrícula ao usuário
- Usuário fornece a matrícula
- Sistema procura a pessoa por matrícula
- Se houver resultados, imprime os dados da pessoa
- Caso contrário, informa “não houve dados encontrados”

Consultar dados de uma pessoa e ler uma entrada do usuário na forma de uma matrícula, que será buscada numa lista de 5 pessoas, entre alunos, professores e administrativos, que deve ser povoada e mantida a cada execução do programa.
