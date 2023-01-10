package ufjf.br;

public class FechamentoPedidoAcao implements Acao {
    private Pedido pedido;

    public FechamentoPedidoAcao(Pedido pedido){
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.fecharPedido();
    }

    @Override
    public void cancelar() {
        this.pedido.abrirPedido();
    }
}
