//somar 0 + 1 + 2 + 3 + ... + n
public class RecursaoSomatorioValores {
  public static int somar(int n){
    if (n == 0)
      return 0;
    return n + somar(n - 1);
  }
  public static void main(String[] args) {
    somar(5);
  }
}
