Esse projeto foi inspirado pelo site americansongwriter.com 
e apenas ligeiramente aborda uma possível implementação do banco de dados do site.

1) Para iniciar o programa é necessário "startar" a aplicação através da classe Application.
Ao ser iniciado, o programa exibirá uma interface onde o usuário poderá 
adicionar, buscar, alterar e remover artistas no banco de dados.

2) Para adicionar, é necessário preencher os campos com o nome, gênero musical,
obra mais aclamada(Magnus Opus) e produtora do artista, e depois clicar no botão "Adicionar".
O programa não aceita que nenhum campo seja enviado vazio e mostrará uma mensagem criada pela
correspondente exceção gerada.

3) Para buscar um artista no banco de dados basta digitar o nome do artista no campo de texto
segunda tabPanel "Buscar Artista" e depois clicar no botão "Buscar". O programa exibirá todos os artistas
com o nome informado, além do gênero, produtora e magnus opus.

4) Para alterar um artista, basta clicar duas vezes no artista desejado na aba "Buscar Artista" e a tela
será redirecionada para a aba "Editar Artista". Nela, o usuário poderá alterar as informações que desejar.
Nessa janela também é possível exportar todo o banco de dados para um arquivo .csv e remover um 
artista do banco de dados.

5) Na pasta do projeto está um exemplo de arquivo .csv gerado.

6) Para visualizar o client no browser é necessário startar a aplicação como recomendado no item 1,
depois acessar o endereço http://localhost:8080/h2/ e clicar em "Connect". O JDBC URL do
projeto é: jdbc:h2:file:~/artistas;DB_CLOSE_ON_EXIT=FALSE
