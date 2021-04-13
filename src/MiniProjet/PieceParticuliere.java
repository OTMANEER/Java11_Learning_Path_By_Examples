package MiniProjet;

public class PieceParticuliere extends  Piece{
    public int puissance;

    public PieceParticuliere(String name, int puissance){
        this.denomination = name;
        this.puissance = puissance;
    }
    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public float getPoid() throws Exception {
        return this.poids;
    }
}
