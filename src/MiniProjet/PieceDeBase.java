package MiniProjet;

public class PieceDeBase extends Piece implements Comparable<Piece>{
    int occurence;
    public PieceDeBase(int reference, int occurence) {
        this.reference = reference;
        this.occurence= occurence;
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
        return " reference: " + reference +", occurences: "+occurence;
    }

    @Override
    public int compareTo(Piece pieceIntegerPaire) {
        return this.reference - pieceIntegerPaire.getReference();
    }
}
