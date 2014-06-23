java-sort
=========

Projeto para comparar desempenho de métodos sort em Java.<br />
O funcionamento do programa se ressume em:
 * Interpretar um arquivo XML que contém os dados para serem ordenados;
 * Escolher por qual informação será feita a ordenação;
 * Executar a ordenação e exibir os resultados.
 
Setup
=======

Dentro do projeto você vai encontrar o package **sorts** com as classes responsáveis por fazer as ordenaçoes.<br/>
No package **timer** contém a classe que é responsável por marcar o tempo de execução em milisegundos.
Fora de packages existe a classe principal **APSOrder** e **Caminhao** (usei caminhões para serem os objetos que serão ordenados). A classe **Caminhao** contém todos os getters/setters para as informações que virão do XML, assim toda vez que for instanciada ela receberá esses atributos.<br/>
Você vai reparar que existem dois arquivos **XML**, *Caminhoes.xml* e *Caminhoes2.xml*, um contém 5 mil registros, e o outro 50 mil. Utilizei estes dois para ver a diferença com cargas extremas.

__obs:__ O projeto foi criado no NetBeans, por causa que era utilizado para fins acadêmicos. Caso queira utilizar em outra IDE é só criar um novo projeto e copiar as classes.

### Quer contribuir? Alguma dica para melhorar o código? ###

* De um fork
* Faça um Pull Request

Por enquanto é isso. [@RafaelPazini](http://twitter.com/RafaelPazini)
