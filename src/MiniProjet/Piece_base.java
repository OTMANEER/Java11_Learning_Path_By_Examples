package MiniProjet;

public class Piece_base extends Piece{
    public Piece_base(String denomination,float poid) {
        this.denomination = denomination;
        this.poids= poid;
    }

    @Override
    public String toString() {
        return "Piece_base-> { " +
                "denomination=  " + denomination +
                ", poids= " + poids +" }";
    }
}
