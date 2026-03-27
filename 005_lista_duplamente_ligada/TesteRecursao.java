public class TesteRecursao {
  public static void main(String[] args) {
    var lista = new ListaDuplamenteLigada();
    lista.inserirNoComeco("a");
    lista.inserirNoComeco("b");
    lista.inserirNoComeco("c");
    System.out.println();
    lista.iterarRecursivamente(lista.primeiro);


  }
}
