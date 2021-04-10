package MiniProjet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PieceComposite extends Piece {
    LinkedList<Paire> listePieceComposite;

    public PieceComposite(String denomination) {
        this.denomination = denomination;
        this.listePieceComposite = new LinkedList<>();
    }

    public void ajouter_piece(Piece piece,int nb_occurrences) {
        Paire<Piece , Integer> paire = new Paire<Piece ,Integer>(piece,nb_occurrences);
        for(int i = 0;i<listePieceComposite.size();i++) {
            if (listePieceComposite.get(i).getPiece().equals(piece)) {
              listePieceComposite.get(i).setNb_occurrence(listePieceComposite.get(i).getNb_occurrence() + nb_occurrences);
              return;
            }
        }
        this.listePieceComposite.add(paire);
    }

    public void affiche_tous_sous_pieces(int decal) {
        String s=" ";
        for(int i=0;i<decal;i++)
            s+=" ";
        for(Paire piece:listePieceComposite){
            System.out.println(s+piece.toString());
        }
    }

    @Override
    public String toString() {
        return "Piece Composite :"+this.denomination +"\n\t\t"+ listePieceComposite.toString()+"\n\t\t";
    }
@Override
    public float getPoid() {
        float temp = 0;
        for(Paire paire:listePieceComposite){
            temp +=paire.getPiece();
        }
        return temp;
    }
}


