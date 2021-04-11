package MiniProjet;

public class Paire<T extends Piece,Integer> {
    public int nb_occurrences=0;
    public T  piece;

    public Paire(){
    }
    public Paire(T  piece,int nb_occurrences) {
        this.piece = piece;
        this.nb_occurrences += nb_occurrences;
    }


    public void setNb_occurrence(int nb_occurrence) {
        this.nb_occurrences = nb_occurrence;
    }

    public int getNb_occurrence() {
        return this.nb_occurrences;
    }

    public void setPiece(T  piece) {
        this.piece = piece;
    }

    public Piece  getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        if(this.piece.getClass() == PieceDeBase.class){
            return "" + piece.toString() + ", Nombre d'occurrences =" + nb_occurrences +"\n\t\t";
        }else{
            return "" + piece.toString()+"\n";
        }
    }
}