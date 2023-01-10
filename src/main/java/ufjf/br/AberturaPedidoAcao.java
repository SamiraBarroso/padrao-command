package ufjf.br;

public class AberturaPedidoAcao implements Acao {

    private Pedido pedido;

    public AberturaPedidoAcao(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.abrirPedido();
    }

    @Override
    public void cancelar() {
        this.pedido.fecharPedido();
    }
}
