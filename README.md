# Java-With_OO
Pequeno projeto com estruturas de orientação a objeto

# Conteúdo 
Será criado um pequeno projeto de venda de livros e cadernos, tendo sua forma de venda por pedido, com direito a uso de cupons de desconto.

# Entidades
Livro, Caderno, Cliente, Pedido e Cupom;

# Classes
Produto, Gênero e Matérias;

# Relacionamentos
P R O D U T O<----PEDIDO---->CLIENTE
 |         |        |
LIVRO   CADERNO   CUPOM
 |         |
GENERO MATERIAS

# Atributos
Classe PRODUTO(atributos: Preço; Quantidade; metodo: calcularFrete)
Classe LIVRO extends PRODUTO(atributos: Nome; Genero)
Classe CADERNO extends PRODUTO(atributos: Qtd. Materias; tipo)
Classe CUPOM(atributos: Código; % Desconto);
Classe CLIENTE(atributos: Nome; CPF)
Classe PEDIDO(atributos: codigo; total; Lista PRODUTO; CUPOM; CLIENTE)
ENUM MATERIA(M2, M5, M10)
ENUM GENERO(DRAMA, SUSPENSE, ROMANCE)