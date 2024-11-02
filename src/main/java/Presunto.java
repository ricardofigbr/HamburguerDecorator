public class Presunto extends IngredienteDecorator {

    public Presunto(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getAcrescimo() {
        return 0.40f;
    }
}