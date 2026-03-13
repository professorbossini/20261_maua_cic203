import java.util.Random;
public class TesteV2 {
  public static void main(String[] args) throws Exception{
    var gerador  = new Random();
    var playlist = new ListaLigada();
    String[] todas = {"One", "Two", "Three", "Four", "Five", "Six"};
    while(true){
      var m = todas[gerador.nextInt(0, todas.length)];

      var oQueFazer = gerador.nextInt(1, 5);
      //1. Adicionar no começo
      //2. Adicionar no fim
      //3. Remover do começo

      switch(oQueFazer){
        case 1:
          System.out.println("Adicinando no começo...");
          playlist.adicionarNoComeco(m);
          break;
        case 2:
          System.out.println("Adicionando no fim...");
          playlist.adicionarNoFim(m);
          break;
        case 3:
          System.out.println("Removendo do começo...");
          playlist.removerDoComeco();
          break;
        case 4:
          System.out.println("Removendo do fim...");
          playlist.removerDoFim();
      }

      System.out.println(playlist);
      System.out.println("=================================");
      Thread.sleep(5000);
    }
  }
}
