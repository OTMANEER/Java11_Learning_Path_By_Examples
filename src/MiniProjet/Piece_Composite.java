package MiniProjet;

import java.util.LinkedList;

public class Piece_Composite extends Piece {
    LinkedList<Paire> listPaire;

    public Piece_Composite() {
        this.listPaire = new LinkedList<>();
    }

    public void ajouter_piece(Piece piece) {
        int i = 0;
        if (listPaire.contains(piece)) {

        }
        Paire<Piece, Integer> paire = new Paire<>();
        this.listPaire.add(paire);
    }

    public void affiche_tous_sous_pieces() {
    }

}


