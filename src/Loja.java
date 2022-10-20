
import java.util.*;

public class Loja {

    private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    //Pedido[] pedido = new Pedido[30];
    Map<String, String> valores = new HashMap<String, String>();


    public Loja() {
        this.listaPedidos = listaPedidos;
    
    }


    
    Pedido[] pedido = new Pedido[1000];
    public void criarPedido(){
        int quantidadePedidos = InOut.leInt("Digite quantos pedidos você deseja criar: ");
        for (int p; p < quantidadePedidos; p++){
            pedido[p] = new Pedido(p, InOut.leString("Digite seu nome: "));
        }
/* 
        Pedido[] pedido = new Pedido[1000];
        public void criarPedido(){
            int quantidadePedidos = InOut.leInt("Digite quantos pedidos você deseja criar: ");
            for (int p; p < quantidadePedidos; p++){
                pedido[p] = new Pedido(p, InOut.leString("Digite seu nome: "));
            }
    
*/
        // Pedido p[] = new Pedido(1);
         //InOut.leString("Digite seu nome: ")

        
    }

}
