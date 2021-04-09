package MiniProjet;

public class Paire<Piece,Integer> {
    public int nb_occurrence;
    Piece piece;

    public Paire(){
    }
    public Paire(int nb_occurrence, Piece piece) {
        this.nb_occurrence = nb_occurrence;
        this.piece = piece;
    }

    public void setNb_occurrence(int nb_occurrence) {
        this.nb_occurrence = nb_occurrence;
    }

    public int getNb_occurrence() {
        return this.nb_occurrence;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
