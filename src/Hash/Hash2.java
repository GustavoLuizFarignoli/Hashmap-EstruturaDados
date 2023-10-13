package Hash;

import Arvore.ArvoreBusca;

public class Hash2 extends HashPai {
    private ArvoreBusca[] tabela;

    public Hash2(int tamanho) {
        this.tabela = new ArvoreBusca[tamanho];
        for (int i = 0; i < tamanho; i++){
            this.tabela[i] = new ArvoreBusca();
        }
    }

    @Override
    public void inserir(Aluno aluno) {
        int posicao;
        if(aluno.getMatricula() == null){
            posicao = func_hash(Integer.toString(aluno.getId()));
        } else {
            posicao = func_hash(aluno.getMatricula());
        }
        ArvoreBusca.No no = new ArvoreBusca.No(aluno);
        tabela[posicao].inserir(tabela[posicao].raiz,no);
    }
    @Override
    public Aluno buscar(String matricula, boolean id) {
        return null;
    }

    @Override
    public Aluno remover(String identificador, boolean id) {
        return null;
    }
}
