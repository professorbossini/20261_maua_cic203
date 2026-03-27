public class RecursaoBuscaBinaria {
  public static int buscaBinaria(int [] v, int valor, int inicio, int fim){
    //caso base, devolva -1
    if(inicio > fim)
      return -1;
    //calcular o meio
    int meio =  (inicio + fim) / 2;
    //se encontrar na posição meio, devolver
    if(v[meio] == valor)
      return meio;
    if(valor < v[meio])
      return buscaBinaria(v, valor, inicio, meio - 1);
    return buscaBinaria(v, valor, meio + 1, fim);
    //senão, comparar: se o valor for menor, buscar no subvetor à esquerda, senão, buscar no subvetor à direita
  }
  public static void main(String[] args) {
    int [] v = {2, 5, 8, 12, 16, 23, 38, 45, 67, 91};
    System.out.println(buscaBinaria(v, 23, 0, 9));
    System.out.println(buscaBinaria(v, 10, 0, 9));

  }
}
