public class Tomate extends IngredienteDecorator {

    public Tomate(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getAcrescimo() {
        return 0.60f;
    }
}