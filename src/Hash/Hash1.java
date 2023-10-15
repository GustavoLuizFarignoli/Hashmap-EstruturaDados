package Hash;

public class Hash1 extends HashPai {
    private Aluno[] tabela;

    public Hash1(int tamanho) {
        setTabela(new Aluno[tamanho]);
        setTamanho(tamanho);
    }

    @Override
    public void inserir(Aluno aluno) {
        int posicao;
        if(aluno.getMatricula() == null){
            posicao = func_hash(Integer.toString(aluno.getId()));
        } else {
            posicao = func_hash(aluno.getMatricula());
        }
        if (temcolisao(posicao)){
            if (verificarcarga()){
                expandir();
            }
            for (int i = 0; i < getTabela().length; i++){
                if (!temcolisao(i)){
                    setaluno(i,aluno);
                    break;
                }
            }
        } else {
            if (verificarcarga()){
                expandir();
            }
            setaluno(posicao, aluno);
        }
    }

    @Override
    public Aluno buscar(String identificador, boolean id) {
        int posicao = func_hash(identificador);
        Aluno encontrado = getaluno(posicao);
        if (id){
            if (encontrado != null){
                if (Integer.parseInt(identificador) == encontrado.getId()){
                    System.out.println("Aluno encontrado");
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (Integer.parseInt(identificador) == getaluno(i).getId()) {
                        return getaluno(i);
                    }
                }
            }
        } else {
            if (encontrado != null){
                if (identificador == encontrado.getMatricula()){
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (identificador == getaluno(i).getMatricula()){
                        return getaluno(i);
                    }
                }
            }
        }
        return null; // precisar tratar o null no main
    }

    @Override
    public Aluno remover(String identificador, boolean id) {
        int posicao = func_hash(identificador);
        Aluno encontrado = getaluno(posicao);
        if (id){
            if (encontrado != null){
                if (Integer.parseInt(identificador) == encontrado.getId()){
                    setaluno(posicao,null);
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (Integer.parseInt(identificador) == getaluno(i).getId()) {
                        encontrado = getaluno(i);
                        setaluno(i, null);
                        return encontrado;
                    }
                }
            }
        } else {
            if (encontrado != null){
                if (identificador == encontrado.getMatricula()){
                    setaluno(posicao,null);
                    return encontrado;
                }
            }
            for (int i = 0; i < getTabela().length; i++){
                if (getaluno(i) != null) {
                    if (identificador == getaluno(i).getMatricula()){
                        encontrado = getaluno(i);
                        setaluno(i, null);
                        return encontrado;
                    }
                }
            }
        }
        return null;
    }

    public void expandir(){
        int tamanho_novo = getTamanho() * 2;
        Aluno[] temp = getTabela();
        setTabela(new Aluno[tamanho_novo]);
        setTamanho(tamanho_novo);
        setN_elementos(0);
        for (int i = 0; i < temp.length; i++){
            if (temp[i] != null){
                inserir(temp[i]);
            }
        }
    }

    public boolean temcolisao(int i) {
        if (this.tabela[i] == null){
            return false;
        }
        return true;
    }

    public Aluno[] getTabela() {
        return tabela;
    }

    public void setTabela(Aluno[] tabela) {
        this.tabela = tabela;
    }

    public Aluno getaluno(int i){
        return this.tabela[i];
    }

    public void setaluno(int i, Aluno aluno){
        this.tabela[i] = aluno;
        setN_elementos(getN_elementos()+1);
    }
}
