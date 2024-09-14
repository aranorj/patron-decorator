public abstract class Personaje {

    protected String descripcion;
    protected int puntosDeVida;

    public Personaje(String descripcion, int puntosDeVida) {
        this.descripcion = descripcion;
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
