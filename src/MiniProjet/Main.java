package MiniProjet;

public class Main {
    public static void main(String[] args) {
/*        PieceDeBase  pieceDeBase = new PieceDeBase("Placard",10F);
        PieceDeBase  pieceDeBase1 = new PieceDeBase("Placard",10F);
        PieceComposite piece1 = new PieceComposite();
        piece1.ajouter_piece(pieceDeBase,10);
        piece1.ajouter_piece(pieceDeBase1,10);

        PieceComposite piece = new PieceComposite();
        piece.ajouter_piece(pieceDeBase,10);
        piece.ajouter_piece(pieceDeBase1,10);
        piece.ajouter_piece(pieceDeBase1,10);
        piece.ajouter_piece(piece1,1);
        piece.affiche_tous_sous_pieces();*/

        PieceDeBase pieceDeBase = new PieceDeBase("TaRo",11.2F);
        PieceDeBase pieceDeBase1 = new PieceDeBase("KACHA",1.2F);
        PieceDeBase pieceDeBase2 = new PieceDeBase("Mkheda",2.2F);
        PieceComposite pieceComposite = new PieceComposite("Cuisine");
        PieceComposite pieceComposite1 = new PieceComposite("Salon");
        pieceComposite.ajouter_piece(pieceComposite1,12);
        pieceComposite.ajouter_piece(pieceComposite1,12);
        pieceComposite1.ajouter_piece(pieceDeBase,8);
        pieceComposite1.ajouter_piece(pieceDeBase,8);
        pieceComposite1.ajouter_piece(pieceDeBase,8);     pieceComposite.ajouter_piece(pieceDeBase,8);
        pieceComposite1.ajouter_piece(pieceDeBase,8);
        pieceComposite1.ajouter_piece(pieceDeBase,8);
        pieceComposite1.ajouter_piece(pieceDeBase1,2);

        pieceComposite.ajouter_piece(pieceDeBase,8);
     pieceComposite.ajouter_piece(pieceDeBase,8);
     pieceComposite.ajouter_piece(pieceDeBase,8);
     pieceComposite.ajouter_piece(pieceDeBase,8);
     pieceComposite.ajouter_piece(pieceDeBase1,2);

       pieceComposite.affiche_tous_sous_pieces(10);

    }
}
