package ufjf.br;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CozinhaTest {
    Cozinha cozinha;
    Pedido pedido;
    List<String> itensPedidos;

    @BeforeEach
    void setUp() {
        cozinha = new Cozinha();
        itensPedidos = new ArrayList<String>();
        itensPedidos.add("Suco de laranja");
        itensPedidos.add("Pastel de queijo");
        pedido = new Pedido (023, itensPedidos);
    }

    @Test
    void deveAbrirPedido() {
        Acao aberturaPedido = new AberturaPedidoAcao(pedido);
        cozinha.executarAcao(aberturaPedido);

        assertEquals("Pedido em preparação", pedido.getSituacao());
    }

    @Test
    void deveFecharPedido() {
        Acao fechamentoPedido = new FechamentoPedidoAcao(pedido);
        cozinha.executarAcao(fechamentoPedido);

        assertEquals("Pedido cancelado", pedido.getSituacao());
    }

    @Test
    void deveCancelarFechamentoPedido() {
        Acao aberturaPedido = new AberturaPedidoAcao(pedido);
        Acao fechamentoPedido = new FechamentoPedidoAcao(pedido);

        cozinha.executarAcao(aberturaPedido);
        cozinha.executarAcao(fechamentoPedido);

        cozinha.cancelarUltimoAcao();

        assertEquals("Pedido em preparação", pedido.getSituacao());
    }



}