import java.util.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) {
        Loja mercadinhoGnomo = new Loja();
        
        Calendar data = Calendar.getInstance(); // SOCORRO!!

        JMenuBar menuBar = new JMenuBar();
        JButton b8787 = new JButton("Botão");

        // Tentativa automatizada de instanciar o pedido.

        mercadinhoGnomo.criarPedido();


        // Instanciando Mercadorias da Loja
        Mercadoria chapeu = new Mercadoria("Chapeu", 1, 20, 100);
        Mercadoria galocha = new Mercadoria("Galocha", 2, 50, 100);
        Mercadoria cachorro = new Mercadoria("Cachorro", 3, 10, 40);


        // // Instanciando Pedido número 1
        // Pedido p1 = new Pedido(1, InOut.leString("Digite seu nome: "));
        // //InOut de recebimento!
        //InOut.MsgDeInformacao("Olá, " + p1.nomePessoa, "Parabéns!. Vamos começar as compras");
        // String p = "p2";
        // System.out.println(p);


        // // Adicionando itens ao carrinho
        // p1.adicionarItem(cachorro, 1);
        // p1.adicionarItem(cachorro, 1);

        // //InOuts sobre informação do valor
        // InOut.MsgDeInformacao(null, "Valor total do pedido: " + p1.calcularValor() + " reais.");
        // //InOut sobre informação dos
        // InOut.MsgDeInformacao("Ola", cachorro.getEstoqueMercadoria() + " Cachorros");




    
        

    }
}
