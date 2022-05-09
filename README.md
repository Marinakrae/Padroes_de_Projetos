<h1> Padroes_de_Projetos </h1>
Exercícios desenvolvidos na disciplina de Padrões de Projeto

  <h2>Exercício 1: </h2>

<p>Crie uma classe banco que armazene um conjunto de contas e forneça métodos que permitam que sejam feitos criações de conta, exclusão de contas,
  saques (uma conta corrente só pode fazer saques desde que o valor não exceda o limite de saque -limite + saldo-), depósitos, emissão de saldo e extrato e transferência entre contas.<br>
– Uma conta possui um número, um saldo, um status que informa se ela é especial ou não, um limite e um conjunto de movimentações.<br>
- Uma movimentação possui uma descrição, um valor e uma informação se ela é uma movimentação de crédito, débito ou de rendimento financeiro.<br>
– Além disto as contas podem ser do tipo: Poupança, Conta-corrente, Fundos de Renda Fixa ou Fundos de Renda Variável. Dentre estes apenas os rendimentos
de renda fixa e variável são tributados pelo IR, nestes casos deverá existir um método que calcula o valor do imposto devido com base no rendimento financeiro do mês <br> e a alíquota de 27,5%. </p>

<p>+ </p>

<p> Altere o exercício e utilize Map para representar o
conjunto de contas existente no banco associado a cada
identificador de conta. <br>
– Desenvolva uma classe que crie 10.000 contas, inserindo
uma a uma no banco e depois percorra estas contas; <br>
– Busque cada uma destas contas com o método get(),
enquanto percorre novamente o mapa; <br>
– Contabilize o tempo gasto para inserir, percorrer o Map e
buscar todos os objetos em cada tipo de implementação
diferente do Map. <p>
  
 <p>+ </p>

<p>Desenvolva classes para testar o código desenvolvido utilizando reflexão. Deverá carregar as classes principais e imprimir nomes de todos os campos e métodos;<br>
– Além disso deverá invocar métodos do Banco para teste;<br>
– As classes a serem testadas devem ser carregadas a partir de um arquivo jar carregado em runtime.<br>
  • Obs.: utilize JFileChooser para seleção do arquivo jar no início da execução.</p>



  <h2>Exercício 2:</h2>

<p>Modelar e implementar um sistema de representação de um imóvel juntamente com o cálculo de área total construída do imóvel, bem como o seu volume interno; <br>
– O imóvel deverá ter um conjunto de peças, sendo que cada uma deverá calcular a sua área com base nas formas geométricas que compõem a mesma; <br>
– Deverão existir as seguintes formas:<br>
• (semi)Círculo, quadrado, losango, retângulo e triângulo; <br>
• Cada forma deve contar com as medidas necessárias para implementar um método que calcula a sua área; <br>
– Cada peça deverá ter o seu pé-direito de forma que se possa calcular o volume da mesma; <br>
– Peças deverão ter identificação; <br>
– O imóvel deverá possuir identificação, tipo de uso (comercial, residencial), proprietário e endereço;</p> <br>
