# Desafios - Academia Capgemini 2022

Todos os desafios foram implementados originalmente em Node.JS porque me sinto mais confortável lá, mas foram adaptados para Java.

O gerenciador de dependências utilizado foi o Gradle 7.3.3 e a versão utilizada do Java foi a 14. As únicas dependências do projeto são o JUnit 5 pra realização dos testes unitários.

Para rodar o projeto é necessário ter instalado o Gradle e o Java na versão 8+. Tendo isso na máquina basta rodar ```gradle build``` em um terminal e aguardar o processo de build. Para rodar os testes é necessário rodar o comando ```gradle test```.

No código possui comentários sobre os métodos e o que eles fazem, sendo que cada desafio possui sua própria classe. A classe main e seu respectivo método estão vazios pelo motivo de já haver testes mas em caso da necessidade do uso dela basta instanciar as classes e rodar os métodos relacionados aos requisitos do desafio.

Abaixo segue uma breve documentação dos principais métodos utilizados (os comentários detalham mais sobre a implementação): 

### Desafio 01

```void buildLadder(int height)```

- Dada uma altura definida no parâmetro do método, realiza a construção da figura de escadas com asteriscos.

### Desafio 02

```String verifyPassword(String password)```

- Dada uma senha ela verifica se a senha é forte ou não verificando o tamanho da senha e usando uma expressão regular pra verificar se todos os requisitos estão sendo atendidos.

### Desafio 03


```int countAllAnagrammaticPairs(String str)```

- Esse método "cola" toda a lógica do problema. Aqui é usado um contador de pares anagramáticos que acresce toda a vez que é encontrado um par. Esses pares são encontrados verificando todas as substrings possíveis e vendo se elas são anagramas ou não por meio de dois loops.

```void getAllPossibleSubstrings(String str)```

- Responsável por receber a string que precisa ser verificada e quebrar em todas as substrings possíveis a serem comparadas.

```boolean isAnagram(String substr1, String substr2)```

- Responsável por checar se duas substrings são anagramas ou não rearranjando elas em dois arrays de caracteres ordenados em ordem alfabética e comparando se são iguais.

```char[] convertFromStringToCharAndOrderByASC(String str)```

- Responsável por transformar uma string em um array de char ordenado por ordem alfabética.