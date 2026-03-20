public class ListaDuplamenteLigada {
  No primeiro;
  No ultimo;
  int quantidade;

  boolean estaVazia(){
    return quantidade == 0;
  }

  String acessar(int posicao){
    if(estaVazia() || posicao >= quantidade || posicao < 0)
      return null;
    if(quantidade == 1)
      return primeiro.musica;
    No aux = primeiro;
    int contador = 0;
    while(contador <= posicao){
      aux = aux.proximo;
      contador++;
    }
    return aux.musica;


  }

  void inserirNoComeco(String musica){
    var novo = new No(musica);
    if(estaVazia()){
      primeiro = novo;
      ultimo = novo;
    }
    else{
      novo.proximo = primeiro;
      primeiro.anterior = novo;
      primeiro = novo;
    }
    quantidade++;
  }
  //exemplo: 1, 2, 3

  void removerDoComeco(){
    if(!estaVazia()){
      if(quantidade == 1){
        primeiro = null;
        ultimo = null;
      }
      else{
        primeiro = primeiro.proximo;
        primeiro.anterior = null;
      }
      quantidade--; 
    }
  }

  void removerDoFinal(){
    if(!estaVazia()){
      if(quantidade == 1){
        removerDoComeco();
      }
      else{
        ultimo = ultimo.anterior;
        ultimo.proximo = null;
        quantidade--;
      }
    }
  }
  
  public void exibirAPartirDoInicio(){
    //primeiro -> 1 <-> 2 <-> 3 <-> null
    System.out.print("primeiro->");
    //para encontrar o último
    No aux = primeiro;
    while(aux != null){
      System.out.print(aux.musica + "<->");
      aux = aux.proximo;
    }
    System.out.println("null");
  }

  public void exibirAPartirDoFinal(){ 
    //ultimo -> 3 <-> 2 <-> 1 <-> null
    System.out.print("último->");
    No aux = ultimo;
    while (aux != null){
      System.out.print(aux.musica + "<->");
      aux = aux.anterior;
    }
    System.out.println("null");
  }
}
