package Hash;

import Arvore.ArvoreBusca;

public class Hash2 extends HashPai {
    private ArvoreBusca[] tabela;

    public Hash2(int tamanho) {
        this.setTamanho(tamanho);
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
    public Aluno buscar(String identificador, boolean id) {
        int posicao = func_hash(identificador);
        int valor = determinarvalor(identificador,id);
        ArvoreBusca.No no = tabela[posicao].busca(tabela[posicao].raiz,valor);
        if (no != null){
            return no.getAluno();
        }
        return null;
    }

    @Override
    public Aluno remover(String identificador, boolean id) {
        int posicao = func_hash(identificador);
        int valor = determinarvalor(identificador,id);
        tabela[posicao].raiz = tabela[posicao].excluir(tabela[posicao].raiz,valor);
        return null;
    }

    public int determinarvalor(String identificador, boolean id){
        int valor = 0;
        if (id){
            valor = Integer.parseInt(identificador);
        } else {
            for (int i = 0; i < identificador.length(); i++){
                char c = identificador.charAt(i);
                valor += (int) c;
            }
        }
        return valor;
    }

    public ArvoreBusca[] getTabela() {
        return tabela;
    }
}
