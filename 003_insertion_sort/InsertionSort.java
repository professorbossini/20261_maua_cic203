public class InsertionSort {

  public static void go(int [] vetor){
    for(int i = 1; i < vetor.length; i++){
      int carta = vetor[i];
      int j = i - 1;
      while(j >= 0 && vetor[j] > carta){
        vetor[j + 1] = vetor[j];
        j = j - 1;
      }
      vetor[j + 1] = carta;

    }  
  } 
  
  public static void main(String[] args) {
    int vetor [] = new int[]{1, 6, 5, 3, 8, 7, 10, 5, 4, 1};
    go(vetor);
    System.out.println(java.util.Arrays.toString(vetor));
    

  }
}
