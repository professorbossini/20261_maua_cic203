import java.util.Random;
public class Principal {
  public static void main(String[] args) throws Exception{
    var nossoVetor = new NossoVetor();
    var gerador = new Random();
    while(true){
      int a = 1;
      switch(a){
        case 1:
          break;
        case 2:
          break;
        case 3, 4:
          break;
        case > 5:
          break;
      }
      //adicionar com probabilidade 60%
      //remover com probabilidade 30%
      //não fazer nada e exibir o vetor com probabilidade 10%
      var ehParaAdicionar = gerador.nextBoolean();
      if(ehParaAdicionar){
        System.out.println("Adicionando...");
        var valor = gerador.nextInt(1, 11);
        //adicionar no nossoVetor
        nossoVetor.adiciona(valor);
      }
      else{
        System.out.println("Removendo...");
        nossoVetor.remove();
      }
      //exibir o vetor
      System.out.println(nossoVetor);
      System.out.println("**********");
      Thread.sleep(5000); 
    }
  }
}
