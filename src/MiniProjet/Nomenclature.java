package MiniProjet;

import ProjetJava.PieceDeBase;

import java.util.HashMap;
import java.util.Map;

public class Nomenclature {
    protected String name;
    Map<Integer,Piece> toutesPieces; // this integer should target the reference

    public Nomenclature(String name) {
        this.name = name;
        this.toutesPieces = new HashMap<>();
    }

    public void ajouter(int numero_reference,Piece piece){
        toutesPieces.put(numero_reference, piece);
    }

    @Override
    public String toString() {
        String s="";
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int reference = entry.getKey();
            Piece piece = entry.getValue();
                s+="La piece: " + piece.toString() + ", De reference: " + reference+" ";
            }
        return s;
    }
    public Piece chercherUnePiece(int reference){
        String s="";
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int ref = entry.getKey();
            Piece piece = entry.getValue();
            if(ref == reference)
                return piece;
        }
        System.out.println("Object non trouvé");
        return null;
    }
    /*Q 3.5 Ajouter une méthode affichant toutes les pièces (composites) contenant une pièce passées en paramètre.*/
    public void afficher_toutes_pieces_composites(Piece p){
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int ref = entry.getKey();
            Piece piece = entry.getValue();
            if(p.equals(piece) && piece.getClass().equals(PieceComposite.class)) {
                System.out.println(piece);
                return;
            }
        }
        System.out.println("Aucune Piece Composite trouvée, Je pense qu'il s'agit d'une piece de Base!");
    }
/*
    Q 3.6 Ajouter une méthode permettant de supprimer une pièce de la nomenclature. On n’autorise
    cette suppression que seulement si cette pièce n’entre pas dans la composition d’une autre pièce.*/

    public void Supprimer_piece(Piece piece){

    }
}
