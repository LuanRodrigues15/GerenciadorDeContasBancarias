# Sistema de Gerenciamento de Abertura de Contas Bancárias

## Descrição
Este é um sistema em Java desenvolvido para gerenciar a abertura de contas em um banco, otimizando o cadastro de novos clientes e a administração dos dados de forma segura. Ele permite:
- Criar, editar e visualizar contas bancárias.
- Gerenciar clientes (pessoas físicas e jurídicas).
- Validar CPF e CNPJ com lógica customizada para garantir a integridade dos dados.
- Gerenciar gerentes de contas e calcular suas pontuações.
- Armazenar contas em uma lista e exibir informações detalhadas.

O sistema foi implementado utilizando conceitos de **POO (Programação Orientada a Objetos)**, como **herança, polimorfismo e encapsulamento**, além de interfaces específicas para validação de dados. A interação com o usuário ocorre por meio de **janelas gráficas (JOptionPane)**.

## Funcionalidades
1. **Gerenciamento de Clientes:**
   - Cadastro de clientes do tipo Pessoa Física (CPF) e Pessoa Jurídica (CNPJ).
   - Validação de CPF e CNPJ por meio de interfaces e lógica dedicada.
   - Utilização de herança para estruturar os tipos de clientes.

2. **Gerenciamento de Gerentes:**
   - Identificação de gerentes pelo nome e CPF.
   - Sistema de pontuação baseado no tipo de conta aberta:
     - +2 pontos para cliente Pessoa Física.
     - +5 pontos para cliente Pessoa Jurídica.
     - +5 pontos adicionais para conta corrente.
     - +10 pontos adicionais para conta investimento.

3. **Gerenciamento de Contas:**
   - Criação de contas com:
     - Número único.
     - Código de tipo de conta (1 para conta corrente, 2 para conta investimento).
     - Dados do cliente e do gerente associados.
   - Lista de contas para armazenamento.

4. **Validação de Dados:**
   - Implementação de interfaces específicas para validar CPF e CNPJ.
   - Mensagens detalhadas para orientar o usuário em casos de erros na entrada de dados.
   - Garantia de integridade e exclusividade no cadastro de informações.

5. **Relatórios:**
   - Impressão de todas as contas registradas no banco, incluindo:
     - Nome do cliente.
     - Tipo de cliente (Pessoa Física ou Jurídica).
     - Tipo de conta (Corrente ou Investimento).
     - Nome do gerente responsável.
   - Exibição do gerente com maior pontuação.

## Estrutura do Código
O projeto é composto pelas seguintes classes principais:
- **Cliente:** Classe abstrata representando um cliente genérico.
- **ClientePessoaFisica:** Herda de `Cliente` e representa clientes com CPF.
- **ClientePessoaJuridica:** Herda de `Cliente` e representa clientes com CNPJ.
- **Gerente:** Representa os gerentes de contas e controla a pontuação.
- **Contas:** Gerencia os dados de uma conta bancária, incluindo o tipo de conta, cliente e gerente.
- **Validador:** Interface utilizada para a validação de CPF e CNPJ.
- **Main:** Classe principal que executa o programa, utilizando janelas gráficas com `JOptionPane`.

## Como Executar
1. Certifique-se de ter o Java instalado na sua máquina.
2. Compile todas as classes do projeto.
3. Execute a classe `Main` para interagir com o sistema.

## Demonstração
1. **Cadastro de Clientes e Contas:**  
   Adicione novos clientes e crie contas associadas. Escolha o tipo de cliente e o tipo de conta.
2. **Validação de CPF e CNPJ:**  
   O sistema realiza verificações automáticas para garantir dados consistentes.
3. **Listagem de Contas:**  
   Visualize os detalhes de todas as contas cadastradas.
4. **Pontuação de Gerentes:**  
   Descubra qual gerente obteve a maior pontuação.

## Exemplo de Saída
Conta Corrente aberta para Pessoa Física:  
Agência 0015 • Conta 123-01, Cliente: João Silva, CPF: 123.456.789-00, Saldo: R$ 0.0, Gerente: Maria Oliveira, CPF: 987.654.321-00, Pontuação: 7  

Gerente com maior pontuação: Maria Oliveira

## Requisitos para Execução
- **Java JDK 8** ou superior.
- Ambiente de desenvolvimento Java, como IntelliJ IDEA ou Eclipse.

---
