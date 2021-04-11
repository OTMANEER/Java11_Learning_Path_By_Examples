package ProjetJava;

public abstract class Piece {
    protected int numero_reference;
    protected String denomination;
    protected float poids;

    public int getNumero_reference() {
        return numero_reference;
    }

    public String getDenomination() {
        return denomination;
    }

    public float getPoids() {
        return poids;
    }

    public void setNumero_reference(int numero_reference) {
        this.numero_reference = numero_reference;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
}
