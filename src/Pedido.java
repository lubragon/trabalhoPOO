import java.util.*;



public class Pedido {
    int id;
    String nomePessoa;
    long data; // SOCORRO!!!!
    double valorTotal;
    ArrayList<Mercadoria> carrinho = new ArrayList<Mercadoria>();
    Mercadoria item = new Mercadoria();

    

    // !!
    public Pedido(int id, String string) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        
    }

    // Métodos - Adicionar - Remover

    void adicionarItem(Mercadoria item, int estoqueMercadoria){
        carrinho.add(item);
        item.setEstoqueMercadoria(estoqueMercadoria);
        
        InOut.MsgDeInformacao("Parabéns!", "A mercadoria " + item.nomeMercadoria + " foi adicionado ao carrinho, com o valor de " + item.precoMercadoria + " reais");
    }
    void removerItem(Mercadoria item, int estoqueMercadoria){
        carrinho.remove(item);
        item.setEstoqueMercadoria(estoqueMercadoria);
        InOut.MsgDeInformacao("Que pena!", "A mercadoria " + item.nomeMercadoria + " foi retirata do carrinho.");
    }

    // Método de calcular valor
    public double calcularValor(){
        double valorFinal = 0;
        for (int i = 0; i < carrinho.size(); i++) {
            if (carrinho.size() - i == 0 ){
                valorFinal += valorTotal;
                valorTotal = 0;
            }
            valorFinal += carrinho.get(i).precoMercadoria;

        }
        
        return valorFinal;

    }

    /*  NÃO ESTÁ SENDO USADO!!
    public int getEstoqueMercadoria(int estoqueMercadoria){
        return estoqueMercadoria;
    }
    */

    public void finalizarPedido(int estoqueMercadoria){
      //  getEstoqueMercadoria();
        // estoqueMercadoria -= "quantidade de itens"
        // Remove itens do estoque.
        // Envia uma mensagemzinha
        // Finaliza a atividade do carrinho
    }


}
