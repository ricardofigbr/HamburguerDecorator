public class Queijo extends IngredienteDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getAcrescimo() {
        return 0.50f;
    }
}