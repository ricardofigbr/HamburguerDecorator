public class HamburguerSimples implements Hamburguer {

    public float price;

    public HamburguerSimples() {
    }

    public HamburguerSimples(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }
}