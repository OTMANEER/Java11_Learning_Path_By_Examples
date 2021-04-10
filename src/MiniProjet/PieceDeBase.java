package MiniProjet;

public class PieceDeBase extends Piece{
    public PieceDeBase(String denomination, float poid) {
        this.denomination = denomination;
        this.poids= poid;
    }
    public String getDenominatio(){
        return this.denomination;
    }
@Override
    public float getPoid() {
        return this.poids;
    }
    @Override
    public String toString() {
        return " Piece  de base:  " +
                "denomination=  " + denomination +
                ",  poids= " + poids +"";
    }
}
