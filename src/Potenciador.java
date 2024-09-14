public abstract class Potenciador extends Personaje{
    protected Personaje personaje;

    public Potenciador(Personaje personaje, String descripcion, int puntosDeVida) {
        super(descripcion, puntosDeVida);
        this.personaje = personaje;
    }

    @Override
    public int getPuntosDeVida(){
        return personaje.getPuntosDeVida() + puntosDeVida;
    }

    @Override
    public String getDescripcion(){
        return personaje.getDescripcion() + " con " + descripcion;
    }

}
