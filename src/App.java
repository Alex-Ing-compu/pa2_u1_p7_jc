import com.edu.ec.negocios.Pedido;
import com.edu.ec.negocios.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido p =  new Pedido("Juan Peres", "laptop",1500, "juan@uce.edu.ec" );
        PedidoService pedidoService = new PedidoService();
        p = null;
        pedidoService.realizarPedido(p);
        pedidoService =  null;


    }
}
