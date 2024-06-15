# Projeto iPhone - Simulação de Funcionalidades

Este projeto é uma simulação das funcionalidades de um iPhone, implementado em Java, utilizando conceitos de interfaces e classes. O projeto demonstra como um iPhone pode reproduzir músicas, fazer chamadas telefônicas e navegar na internet.

## Estrutura do Projeto

### Interfaces

#### ReprodutorMusical
Interface responsável por implementar a funcionalidade de reprodução de arquivos de áudio.
- `void tocar()`: Inicia a reprodução da música.
- `void pausar()`: Pausa a reprodução da música.
- `void selecionarMusica(String musica)`: Seleciona uma música para reprodução.

#### AparelhoTelefonico
Interface responsável por implementar a funcionalidade de um telefone.
- `void ligar(String numero)`: Faz uma ligação para o número especificado.
- `void atender()`: Atende uma chamada.
- `void iniciarCorreioVoz()`: Inicia o correio de voz.

#### NavegadorInternet
Interface responsável por implementar a funcionalidade de um navegador web.
- `void exibirPagina(String url)`: Exibe a página web especificada pelo URL.
- `void adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `void atualizarPagina()`: Atualiza a página atual.

### Classes

#### Musica
Classe que armazena informações sobre as músicas.
- `Musica(String titulo, String artista, int duracao)`: Construtor que inicializa uma nova música com título, artista e duração.
- `String getTitulo()`: Retorna o título da música.
- `String getArtista()`: Retorna o artista da música.
- `int getDuracao()`: Retorna a duração da música.

#### Contato
Classe que armazena informações de contatos.
- `Contato(String nome, String numeroTelefone)`: Construtor que inicializa um novo contato com nome e número de telefone.
- `String getNome()`: Retorna o nome do contato.
- `String getNumeroTelefone()`: Retorna o número de telefone do contato.

#### IPhone
Classe que implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.
- Implementa todos os métodos das interfaces para fornecer a funcionalidade completa de um iPhone.

### Execução

Para executar o projeto, compile e execute a classe `IPhone`. A classe contém um método `main` que demonstra as funcionalidades do iPhone.

```java
public static void main(String[] args) {
    IPhone meuIPhone = new IPhone();

    // Testando ReprodutorMusical
    meuIPhone.selecionarMusica("Minha Música Favorita");
    meuIPhone.tocar();
    meuIPhone.pausar();

    // Testando AparelhoTelefonico
    meuIPhone.ligar("123456789");
    meuIPhone.atender();
    meuIPhone.iniciarCorreioVoz();

    // Testando NavegadorInternet
    meuIPhone.exibirPagina("http://www.exemplo.com");
    meuIPhone.adicionarNovaAba();
    meuIPhone.atualizarPagina();
}


### Explicação:
1. **Estrutura do Projeto**: Descreve as interfaces e classes do projeto, incluindo seus métodos.
2. **Execução**: Fornece um exemplo de como executar o projeto, compilando e rodando a classe `IPhone`.
3. **Requisitos**: Lista os requisitos para rodar o projeto (Java JDK 8 ou superior).
4. **Como Compilar**: Instruções para compilar o código Java.
5. **Como Executar**: Instruções para executar o projeto.
6. **Contribuição**: Informações sobre como contribuir com o projeto.
7. **Licença**: Informação sobre a licença do projeto.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
