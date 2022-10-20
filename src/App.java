import java.util.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) {
        Loja mercadinhoGnomo = new Loja();
        
        Calendar data = Calendar.getInstance(); // SOCORRO!!
        JMenuBar menuBar = new JMenuBar();
        JButton b1 = new JButton("Botão");

        // Instanciando Mercadorias da Loja
        Mercadoria chapeu = new Mercadoria("Chapeu", 1, 20, 100);
        Mercadoria galocha = new Mercadoria("Galocha", 2, 50, 100);
        Mercadoria cachorro = new Mercadoria("Cachorro", 3, 10, 40);
        int indice = 0;
        



        // Tentativa automatizada de instanciar o pedido.
        while (true){
            String nome = InOut.leString("Digite seu nome: ");
            InOut.MsgDeInformacao("Olá, " + nome + "!", "Vamos começar! ");
            int escolha = InOut.leInt("Você gostaria de fazer um pedido?\nDigite [1] para iniciar as compras.\nDigite [2] para cancelar ");
            if (escolha == 2){
                InOut.MsgDeAviso("Poxa, " + nome + " :(", "Mó paia.");
                break;
            }else{
                indice += 1;
                mercadinhoGnomo.criarPedido(indice, nome);
            }
        }







        //mercadinhoGnomo.criarPedido();

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
