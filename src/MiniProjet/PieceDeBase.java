package MiniProjet;

public class PieceDeBase extends Piece{
    public PieceDeBase(String denomination, float poid) {
        this.denomination = denomination;
        this.poids= poid;
    }
    public String getDenomination(){
        return this.denomination;
    }
@Override
    public float getPoid() {
        return this.poids;
    }
    @Override
    public String toString() {
        return "  de base:  " +
                "denomination=  " + denomination +
                ",  poids= " + poids +"";
    }
}
