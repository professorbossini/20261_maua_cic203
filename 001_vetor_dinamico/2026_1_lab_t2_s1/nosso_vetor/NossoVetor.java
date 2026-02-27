public class NossoVetor {
    private int[] vetor;
    private int ocupacao; //quantidade
    private int capacidade;
    private static final int CAP_PADRAO = 4;
    

    //sobrecarga de construtores
    public NossoVetor () {
        this(CAP_PADRAO);
    }
    
    public NossoVetor (int capacidade){
        vetor = new int[capacidade];
        ocupacao = 0; //por clareza
        this.capacidade = capacidade;
    }

    public boolean estaVazio1 () {
        if (ocupacao == 0) return true;
        else return false;
    }
    public boolean estaVazio2 () {
        if (ocupacao == 0) return true;
        return false;
    }
    public boolean estaVazio3 () {
        return ocupacao == 0;
    }
    public boolean estaVazio4 () {
        return ocupacao == 0 ? true : false;
    }
    public boolean estaCheio () {
        return ocupacao == capacidade;
    }

    private void aumentarCapacidade(){
        var aux = new int[2  * capacidade];
        capacidade *= 2;
        for(int i = 0; i < ocupacao; i++){
            aux[i] = vetor[i];
        }
        vetor = aux;
    }

    private void reduzirCapacidade(){
        var aux = new int [capacidade / 2];
        capacidade /= 2;
        for(int i = 0; i < ocupacao; i++){
            aux[i] = vetor[i];
        }
        vetor = aux;

    }

    public boolean adiciona (int elemento) {
        if(estaCheio())
            aumentarCapacidade();
        vetor[ocupacao++] = elemento;
        return true;
    }
    public int remove () {
        if(!estaVazio3()){
            ocupacao = ocupacao - 1;
            if(ocupacao <= capacidade / 4 && ocupacao > CAP_PADRAO)
                reduzirCapacidade();
            return vetor[ocupacao];
        }
        return -1;
    }
    @Override
    public String toString () {
        //StringBuilder
        var sb = new StringBuilder();
        sb.append("Quantidade: ").append(ocupacao).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        if(!estaVazio3()){
            // for (int e : vetor){ //enhanced for ou foreach
            //     sb.append(e).append(" ");
            // }
            for(int i = 0; i < ocupacao; i++){
                sb.append(vetor[i]).append(" ");
            }
        }
        return sb.toString();
    }
}