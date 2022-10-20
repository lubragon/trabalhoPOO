public class Mercadoria {
    public static final String InOut = null;
    String nomeMercadoria;
    int idMercadoria;
    double precoMercadoria;
    int estoqueMercadoria;

    

    public Mercadoria(String nomeMercadoria, int idMercadoria, double precoMercadoria, int estoqueMercadoria){
        this.nomeMercadoria = nomeMercadoria;
        this.idMercadoria = idMercadoria;
        this.precoMercadoria = precoMercadoria; 
        this.estoqueMercadoria = estoqueMercadoria;
    }

    public Mercadoria(){
        
    }



    public double getPrecoMercadoria() {
        return precoMercadoria;
    }

    public String getNomeMercadoria(){
        return nomeMercadoria;
    }
    /* 
    public void setEstoqueMercadoria(int estoqueMercadoria){
        estoqueMercadoria = this.estoqueMercadoria;
    }
    */
        
    public int getIdMercadoria(){
        return idMercadoria;
    }

    public void setEstoqueMercadoria(int estoqueMercadoria){
        this.estoqueMercadoria -= estoqueMercadoria;
    }

    public int getEstoqueMercadoria(){
        return estoqueMercadoria;
    }

}
