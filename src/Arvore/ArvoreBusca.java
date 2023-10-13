package Arvore;

import Hash.Aluno;

public class ArvoreBusca {
    public No raiz;

    public static class No{
        Aluno aluno;
        No esquerdo = null;
        No direito = null;

        public No(Aluno aluno) {
            this.aluno = aluno;
        }

        public int valorizar(){
            int posicao = 0;
            if (this.aluno.getId() != -1){
                posicao = this.aluno.getId();
            } else {
                for (int i = 0; i < this.aluno.getMatricula().length(); i++){
                    char c = this.aluno.getMatricula().charAt(i);
                    posicao += (int) c;
                }
            };
            return posicao;
        }

        @Override
        public String toString() {
            return "Valor: " + aluno;
        }
    }

    public No inserir(No arvore, No novo){
        if (this.raiz == null){
            this.raiz = novo;
        }
        else{
            if (arvore == null) {
                return novo;
            } else{
                if (novo.valorizar() < arvore.valorizar()) {
                    arvore.esquerdo = inserir(arvore.esquerdo, novo);
                } else {
                    arvore.direito = inserir(arvore.direito, novo);
                }
            }
        }
        return arvore;
    }
    public Boolean busca(No arvore, int valor){
        if (arvore == null){
            return false;
        }
        if (valor < arvore.valorizar()) {
            return busca(arvore.esquerdo, valor);
        } else if (valor > arvore.valorizar()){
            return busca(arvore.direito, valor);
        } else {
            return true;
        }
    }

    public No excluir(No arvore, int valor){ //Precisa Conferir se o dado existe na arvore antes de remover, validar no main
        if (arvore == null){
            return null;
        }else if (valor < arvore.valorizar()){
            arvore.esquerdo = (excluir(arvore.esquerdo, valor));
        } else if (valor > arvore.valorizar()){
            arvore.direito = (excluir(arvore.direito, valor));
        }
        else {
            if (arvore.esquerdo == null){
                No temporario = arvore.direito;
                arvore.direito = null;
                return temporario;
            } else if (arvore.direito == null){
                No temporario = arvore.esquerdo;
                arvore.esquerdo = null;
                return temporario;
            } else {
                // arvore.direito, e começa ir para o esquerdo até você chegar num que não tem filho a esquerda
                No sucessor = sucessor(arvore.direito);
                // chamar função de exclusão para esse no
                excluir(this.raiz,sucessor.aluno.getId()); //TEMPORÁRIO PRECISA MUDAR
                // criar um no sucessor com a data desse successor, mas com os filhos do no a ser excluido
                No temp = sucessor;
                temp.esquerdo = arvore.esquerdo;
                temp.direito = arvore.direito;
                //retornar o no temporário
                return temp;
            }
        }
        return arvore;
    }

    public No sucessor(No arvore){
        if (arvore.esquerdo == null){
            return arvore;
        } else {
            return sucessor(arvore.esquerdo);
        }
    }

    public void imprimir(){
        TreeFormatter formatter = new TreeFormatter();
        System.out.println(formatter.topDown(this.raiz));
    }

}
