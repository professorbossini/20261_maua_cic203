public class No {
  String musica;
  No anterior;
  No proximo;
  
  No(String musica){
    this.musica = musica;
    anterior = null;
    proximo = null;
  }
}
