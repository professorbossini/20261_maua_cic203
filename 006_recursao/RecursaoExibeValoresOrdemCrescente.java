//1 2 3 4 5
public class RecursaoExibeValoresOrdemCrescente {
  public static void exibir(int n){
    //caso base
    if(n > 5)
      return;
    System.out.println(n);
    //passo recursivo
    //recursão de calda
    exibir(n + 1);
  }
  public static void main(String[] args) {
    exibir(1);  
  }
}
