package Hash;

public abstract class HashPai {
    private int tamanho;
    private int n_elementos = 0;
    private double fator_carga = 0.75;

    public boolean verificarcarga(){
        return !(((double) n_elementos / tamanho) <= fator_carga);
    }

    public int func_hash(String identificador){
        // se for int precisa passar Integer.toString(id) no parametro
        int posicao = 0;
        for (int i = 0; i < identificador.length(); i++){
            char c = identificador.charAt(i);
            posicao += ((int) c) * (identificador.length() - i) ;
        }
        posicao = posicao % tamanho;
        return posicao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getN_elementos() {
        return n_elementos;
    }

    public void setN_elementos(int n_elementos) {
        this.n_elementos = n_elementos;
    }

    public double getFator_carga() {
        return fator_carga;
    }

    public void setFator_carga(double fator_carga) {
        this.fator_carga = fator_carga;
    }

    public abstract void inserir (Aluno aluno);
    public abstract Aluno buscar (String identificador,boolean id);
    public abstract Aluno remover(String identificador, boolean id);
}
