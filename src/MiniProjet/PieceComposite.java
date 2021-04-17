package MiniProjet;

import java.util.Comparator;
import java.util.LinkedList;

public class PieceComposite extends Piece {
    LinkedList<Paire> listePieceComposite;

    public PieceComposite(String denomination,float poids,int reference) {
        this.poids=poids;
        this.reference = reference;
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
        Comparator<Paire<Piece,Integer>> c = new Comparator<Paire<Piece, Integer>>() {
            @Override
            public int compare(Paire<Piece, Integer> pieceIntegerPaire, Paire<Piece, Integer> t1) {
                return pieceIntegerPaire.getPiece().getReference() - t1.getPiece().getReference();
            }
        };
        this.listePieceComposite.add(paire);
        this.listePieceComposite.sort(c);
    }

    public void affiche_tous_sous_pieces(int decal) throws Exception {
        StringBuilder s= new StringBuilder();
        s.append(" ".repeat(Math.max(0, decal)));
        // More robust?
       // s.indent(decal); // require Java 12!

        for(Paire piece:listePieceComposite){
            if(!this.estComposante(piece.getPiece())){
                throw new Exception();
            }
            System.out.println(s+piece.toString());
        }
    }

    @Override
    public String toString() {
        return "Piece Composite: "+this.denomination +", De reference: "+ this.reference+", poids: "+this.poids+"\n\t\t\t\t"+listePieceComposite.toString()+"";
    }
@Override
    public float getPoid() throws Exception {
        float temp = 0;
        for(Paire paire:listePieceComposite){
            if(!this.estComposante(paire.getPiece()))
                throw new Exception();
          temp +=paire.getPiece().getPoid()*(paire.getNb_occurrence());
            System.out.println(paire.getPiece().getPoid() +" -> "+(paire.getNb_occurrence()));
        }
        return temp;
    }
// Q 2.2
    public boolean estComposante(Piece piece){
        if(this == piece)
            return false;
        for(Paire p: listePieceComposite){
            if(p.getPiece() == piece)
                return true;
        }
        return false;
    }

    @Override
    public int compareTo( Piece pieceIntegerPaire) {
        return this.getReference() - pieceIntegerPaire.getReference();
    }
}


