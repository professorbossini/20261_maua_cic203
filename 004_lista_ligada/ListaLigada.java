public class ListaLigada {
  No primeiro = null;
  int quantidade = 0;

  public void adicionarNoComeco(String musica){
    No novo = new No();
    novo.musica = musica;
    quantidade++;
    if(estaVazia()){
      primeiro = novo;
      primeiro.prox = null;
    }
    else{
      novo.prox = primeiro;
      primeiro = novo;
    }
  }

  public boolean estaVazia(){
    // return primeiro == null;
    return quantidade == 0;
  }

  public void exibir(){
    if(!estaVazia()){
      No aux = primeiro;
      while(aux != null){
        System.out.print(aux.musica + " ");
        aux = aux.prox;
      }
      System.out.println();
    }
    else{
      System.out.println("A lista está vazia");
    }
  }

  public void adicionarNoFim(String musica){
    if(estaVazia())
      adicionarNoComeco(musica);
    else{
      No aux = primeiro;
      while(aux.prox != null)
        aux = aux.prox;
      var novo = new No(musica, null);
      aux.prox = novo;
      quantidade++;
    }
  }
 
  public void removerDoComeco(){
    if(!estaVazia()){
      primeiro = primeiro.prox;
      quantidade--;
    }
  }
  
  public void removerDoFim(){
    if(!estaVazia()){
      if(quantidade == 1){
        removerDoComeco();
      }
      else{
        No aux = primeiro;
        while(aux.prox.prox != null)
          aux = aux.prox;
        aux.prox = null;
        quantidade--;
      }
    }
  }

  @Override
  public String toString() {
    var sb = new StringBuilder("");
    No aux;
    sb.append("Quantidade: ").append(quantidade).append("\n");
    if(!estaVazia()){
      aux = primeiro;
      while(aux != null){
        sb.append(aux.musica).append("->");
        aux = aux.prox;
      }
      sb.append("null\n");
    }
    else{
      sb.append("Lista vazia\n");
    }
    return sb.toString();
  }


}
