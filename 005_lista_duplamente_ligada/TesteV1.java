public class TesteV1 {
  public static void main(String[] args) {
    var lista = new ListaDuplamenteLigada();
    lista.inserirNoComeco("One");
    lista.inserirNoComeco("Two");
    lista.inserirNoComeco("Three");
    lista.exibirAPartirDoInicio();
    lista.exibirAPartirDoFinal();
  }
}
