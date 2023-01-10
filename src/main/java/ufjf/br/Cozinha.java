package ufjf.br;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Acao> acoes = new ArrayList<Acao>();

    public void executarAcao(Acao acao){
        this.acoes.add(acao);
        acao.executar();
    }

    public void cancelarUltimoAcao(){
        if(acoes.size() != 0){
            Acao acoes = this.acoes.get(this.acoes.size() -1 );
            acoes.cancelar();
            this.acoes.remove(this.acoes.size()-1);
        }
    }
}
