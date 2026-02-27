import java.util.Random;
public class BuscaLinearVetor{
  public static int contagemLinear(int [] vetor, int valor){
    var contador = 0;
    for(var e : vetor)
      contador = e == valor ? contador + 1 : contador;
    return contador;
  }
  public static int buscaLinear(int [] vetor, int valor){
    for(int i = 0; i < vetor.length ; i++){
      if(vetor[i] == valor)
        return i;
    }
    return -1;  
  }


  public static void main (String args []){
    var gerador = new Random();
    //prencher um vetor de 16 posições com valores aleatórios entre 1 e 10
    int [] vetor = new int[16];
    for(int indice = 0; indice < vetor.length; ++indice){
      vetor[indice] = gerador.nextInt(1, 11);
    }
    System.out.println("Vetor de busca:");
    for(int e : vetor){
      System.out.print(e + " ");
    }
    //sortear um valor a ser buscado
    var valor = gerador.nextInt(1, 21);
    System.out.println(
      "\nElemento sendo buscado: " + valor
    );
    var resultado = contagemLinear(vetor, valor);
    System.out.printf(
      "O valor %d foi encontrado %d vezes.\n",
      valor, contagem
    );
    //fazer a busca
    // var resultado = buscaLinear(vetor, valor);
    // //dizer se encontrou ou não e, se encontrou, em qual posição
    // if(resultado != -1){
    //   System.out.println("Encontrou na posição: " + resultado);
    // }
    // else{
    //   System.out.println("Não encontrou");
    // }

    //ajustar a busca para que ela responda quantas vezes o elemento existe no vetor


    // int [] vetor = {4, 6, 10, 1, 2, 60, 4, 5}; //syntax sugar
    // //int [] vetor = new int[8];
    // //vetor[0] = 4;
    // var resultado = buscaLinear(vetor, 1);

    // System.out.println(resultado != -1 ? "Encontrou!" : "Não encontrou!");

  }
}