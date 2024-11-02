public abstract class IngredienteDecorator implements Hamburguer {

    private Hamburguer hamburguer;

    public IngredienteDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getAcrescimo();

    public float getPrice () {
        return this.hamburguer.getPrice() + this.getAcrescimo();
    }
}