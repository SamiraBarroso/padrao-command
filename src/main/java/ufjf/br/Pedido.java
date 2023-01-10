package ufjf.br;

import java.util.List;

public class Pedido {
    private int numMesa;
    private String situacao;
    private List<String> itensSolicitado;

    public Pedido(int numMesa,  List<String> itensSolicitado) {
        this.numMesa = numMesa;

        this.itensSolicitado = itensSolicitado;
    }

    public String getSituacao(){
        return this.situacao;
    }

    public void abrirPedido(){
        this.situacao = "Pedido em preparação";
    }

    public void fecharPedido(){
        this.situacao = "Pedido cancelado";
    }
}
