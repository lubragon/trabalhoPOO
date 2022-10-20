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
        Mercadoria alicate = new Mercadoria("Alicate",4 , 5, 200);
        Mercadoria bola = new Mercadoria("Bola",5 , 12, 150);
        Mercadoria xarope = new Mercadoria("Xarope",6 , 7.50, 200);
        Mercadoria cigarro = new Mercadoria("Cigarro Varejo",7 , 0.50, 1000);
        Mercadoria violao = new Mercadoria("Violão",8 , 180.99, 200);
        Mercadoria mosquito = new Mercadoria("Mosquito",9 , 37.90, 2000);
        Mercadoria dicionario = new Mercadoria("Dicionário",10 , 15.90, 2000);
        Mercadoria banana = new Mercadoria("Banana",11 , 10.50, 2000);
        Mercadoria teclado = new Mercadoria("Teclado",12 , 50.90, 2000);
        Mercadoria cadeira = new Mercadoria("Cadeira",13 , 30, 2000);
        Mercadoria sofa = new Mercadoria("Sofá",14 , 250, 2000);
        Mercadoria tesoura = new Mercadoria("Tesoura",15 , 8.90, 2000);
        Mercadoria perfume = new Mercadoria("Perfume",16 , 100, 2000);
        Mercadoria caneca = new Mercadoria("Caneca",17 , 13.50, 300);
        Mercadoria marmita = new Mercadoria("Marmita Café Colonial",18 , 15.50, 150);
        Mercadoria xadrez2 = new Mercadoria("Xadrez 2",19 , 10000, 100);
        Mercadoria chaveOrkut2 = new Mercadoria("Chave de acesso do Orkut 2",20 , 99.99, 50);
        Mercadoria ventilador = new Mercadoria("Ventilador",21 , 75.50, 2000);
        Mercadoria cumbuca = new Mercadoria("Cumbuca",22 , 25.50, 200);
        Mercadoria bolaQuadrada = new Mercadoria("Bola Quadrada",23 , 7.50, 500);
        Mercadoria papoCoach = new Mercadoria("15 min de Papo Coach",24 , 5000, 20);
        



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
