# DesignPattern-Strategy
Projeto em java para exemplificar o uso do Design Pattern Strategy, implementando duas classes concretas 
para a interface desse projeto: a primeira para realizar o cálculo da Média Aritmética, considerando "Aprovado"
os casos em que a Média A. for superior a 5, e a segunda para o cálculo da Média Geométrica, considerando "Aprovado"
os casos em que a Média G. for maior que 7.

## Strategy
O Strategy é um Design Pattern (Padrão de Projeto) que "define uma família de algoritmos, encapsula cada
um deles e permite que os algoritmos variem independentemente entre clientes que os utilizam". Assim, o Strategy é utilizado
quando é preciso um algoritmo cujos dados sejam tratados de modos diferentes.

### Características
- Interface (ICalcMedia): regra de comportamento. Usada quando um objeto pode ser tratado com uma regra padrão. Parece 
com Herança, porém, ao invés de herdar de uma classe só, é permitido a implemetação de múltiplas interfaces;<br><br>
- Classes Concretas (MediaAritmetica/MediaGeometrica): classes que implementam a(s) Interface(s) da Strategy; <br><br>
- Contexto (Disciplina): classe que usa Strategy desejada, contendo uma propriedade que referencia um objeto de uma das
estratégias concretas (ou classes concretas).