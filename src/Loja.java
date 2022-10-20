
import java.util.*;

public class Loja {

    ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    Map<String, String> valores = new HashMap<String, String>();



    public Loja() {
        this.listaPedidos = listaPedidos;
    
    }


    Pedido[] pedido = new Pedido[1000];

    public void criarPedido(int indice, String nome){
        listaPedidos.add(new Pedido(indice, nome));
    }
        
/* 
        int quantidadePedidos = InOut.leInt("Digite quantos pedidos você deseja criar: ");
            for (int p = 0; p < quantidadePedidos; p++){
            p += 1;
            pedido[p] = new Pedido(p, InOut.leString("Digite seu nome: "));
        }

         // Pedido p[] = new Pedido(1);
         //InOut.leString("Digite seu nome: ")
   */

}
