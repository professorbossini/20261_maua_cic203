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
}
