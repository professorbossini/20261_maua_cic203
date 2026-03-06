import java.util.Arrays;
public class BuscaBinariaVetor{
  public static int buscaBinaria(int [] vetor, int valor){
    int inicio = 0, fim = vetor.length - 1;
    while(inicio <= fim){
      int meio = inicio + (fim - inicio) / 2;
      if (valor == vetor[meio]){
        return meio;
      }
      if(valor < vetor[meio]){
        fim = meio - 1;
      }
      else{
        inicio = meio + 1;
      }  
    }
    return -1;
  }

  static public void main(String... args){
    int [] numeros = {5, 4, 3, 1, 7, 6, 5, 4};
    System.out.println("Antes da ordenação...");
    System.out.println(Arrays.toString(numeros));
    Arrays.sort(numeros);
    System.out.println("Depois da ordenação...");
    System.out.println(Arrays.toString(numeros));
    int valor = 9;
    var indice = buscaBinaria(numeros, valor);
    System.out.printf("%s\n", indice < 0 ? "Não encontrado" : "Encontrado em " + indice);
  }
}