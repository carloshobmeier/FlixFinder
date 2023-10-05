# FlixFinder

## Estudo de Domínio para um Software de Filtragem de Filmes, Séries e Atores

### Apresentação do problema
O mercado de entretenimento, especialmente no que diz respeito a filmes e séries, tem crescido exponencialmente nas últimas décadas. Com a proliferação de serviços de streaming e uma vasta biblioteca de conteúdo disponível, os consumidores enfrentam um desafio crescente ao tentar encontrar o que desejam assistir.
Os sistemas de buscas nessas plataformas são muito carentes de recursos para auxiliar na busca, em vista do alto volume de conteúdo (que, de regra, em sua maioria não interessa ao usuário). Eis que os usuários acabam gastando mais tempo 'na procura do que assistir' do que de fato na atividade fim, que seria 'assistindo'.
Para abordar esse problema, propomos o desenvolvimento de um software de filtragem que permitirá aos usuários encontrar filmes, séries e atores de acordo com seus interesses específicos. Na sequência, exploraremos as principais características e requisitos para o desenvolvimento deste software.


### A nossa solução:
![Animação](https://github.com/carloshobmeier/Assets/blob/main/FlixFinder/FlixFinderAnimatedLogo.gif)


### Objetivos do Software e respectivas funcionalidades
O objetivo principal deste software é fornecer uma plataforma eficaz para os usuários descobrirem filmes, séries e atores de acordo com suas preferências. Para tanto, faremos com que os filtros funcionem de forma concorrente, possibilitando uma maior precisão na busca (diferente do que se tem a disposição atualmente). Os principais objetivos incluem:
1.	Filtragem por Nota: Permitir aos usuários filtrar filmes e séries com base em classificações de avaliação, como sua nota no IMDb. Possibilitando colocar como entrada um intervalo. Ex: de 6 a 8.
2.	Filtragem por Ano: Possibilitar a seleção de filmes e séries com base no ano de lançamento, permitindo aos usuários explorar conteúdo de diferentes épocas. Aqui se objetiva uma evolução aos mecanismos presentes no mercado, onde somente é possível definir uma data específica. No nosso sistema será possível definir:
  a)	uma data específica. Ex: 2010.
  b)	um intervalo específico. Ex: de 2010 a 2015.
  c)	uma data máxima. Ex: até 2015.
  d)	uma data mínima. Ex: a partir de 2015.
3.	Filtragem por Gênero(s): Permitir que os usuários escolham filmes e séries de acordo com gêneros específicos: ação, animação, aventura, biografia, comédia, crime, documentário, drama, épico, esporte, fantasia, ficção científica, guerra, história, infantil, luta, mistério, musical, romance, suspense, terror, velho oeste.
Observação: os filmes podem ser classificados com mais de um gênero (ex: Shrek poderia ser - infantil, animação, comédia).
4.	Filtragem por Tema(s): Permitir que os usuários escolham filmes e séries de acordo com temas específicos: aliens, dc, espaço, heróis, japonês, lobisomem, marvel, monstros, pós-apocalíptico, robôs, sequências, Stephen King, tubarão, vampiro, viagem no tempo, zumbis. Possibilidade de o usuário adicionar temas personalizados e associar a filmes.
Observação: os filmes podem ser classificados com mais de um tema (ex: Pacific Rim poderia ser - aliens, robôs, sequências).
5.	Filtragem por Ator(es): Possibilitar a busca por filmes e séries que apresentam atores específicos. No caso seria possível não só filtrar pelo conteúdo de um ator específico, mas também pelo conteúdo que ao mesmo tempo apresente uma multiplicidade de atores.
6.	Filtragem por Duração: Em filmes seria a duração total, enquanto que nas séries os critérios se desdobrariam em duração média dos episódios e quantidade de temporadas.
7.	Filtragem por região do conteúdo: possibilidade de selecionar conteúdos oriundos de uma nacionalidade específica como: Coréia, Japão, Estados Unidos. Ou de Macro-Regiões: Europa, América-Latina, América do Norte, Oriente.
8.	Fichas de informações detalhadas: Fornecer informações detalhadas sobre filmes, séries e atores, incluindo:
a)	atores: nome, gênero, origem, data de nascimento, altura.
b)	filmes: nome, ano, duração, diretor, país, nota.
c)	séries: nome, ano/temporada, duração média dos episódios, criador, nota.

### Requisitos Funcionais
Para atender aos objetivos mencionados, o software de filtragem deve incluir os seguintes requisitos funcionais:
1.	Banco de Dados de Conteúdo: Um banco de dados robusto e atualizado contendo informações sobre filmes, séries e atores, incluindo os dados supracitados. O software possibilitará ao usuário ter controle sobre as informações (podendo incluir registros de seu interesse, ou excluir os registros que não sejam do seu interesse). Tal funcionalidade garantirá que o banco de dados não defasará com a sobrevinda de lançamentos; e que terá as informações mais importantes voltadas para a ótica de cada usuário (não incluindo o que lhe desinteressar, para evitar poluir os resultados de pesquisas).
2.	Interface de Usuário Intuitiva: Uma interface de usuário intuitiva que permita aos usuários realizar buscas, aplicar filtros, inserir registros, excluir registros, e acessar conteúdos de descrição facilmente.

### Conclusão
Um software de filtragem de filmes, séries e atores tem o potencial de facilitar a vida dos amantes do entretenimento, ajudando-os a encontrar conteúdo de acordo com suas preferências pessoais sem perdas de tempo. Nesse sentido, o desenvolvimento do presente software é uma iniciativa que promete revolucionar a experiência dos apaixonados por entretenimento, ao permitir que os usuários encontrem conteúdo alinhado com suas preferências pessoais.
Este programa pode se tornar uma ferramenta valiosa no mundo do entretenimento digital, tendo como principal beneficiário o usuário, que economiza seu os seu tempo de lazer podendo realmente focar no que realmente interessa.
A tarefa de encontrar o conteúdo ideal em meio a uma vasta biblioteca de filmes e séries muitas vezes pode ser desafiadora e demorada. Com a ajuda dos recursos de filtragem (ex: notas, anos e gêneros), os amantes do entretenimento podem direcionar suas buscas com facilidade, evitando assim perdas de tempo não só no processo de escolha quanto no tempo despendido com escolhas pouco satisfatórias.
Em última análise, o software de filtragem de filmes, séries e atores representa uma evolução no universo do entretenimento digital, enriquecendo a experiência do usuário e oferecendo uma maneira mais gratificante de explorar o vasto mundo do cinema.
Com a implementação correta e a atenção contínua às necessidades dos usuários, esse software tem o potencial de se tornar uma ferramenta indispensável para amantes de entretenimento em todo o mundo, com possibilidade de adaptação e integração em várias plataformas já existentes.

### Protótipos das interfaces














