package MiniProjet;

import java.util.*;

public class Nomenclature {
    protected String name;
    Map<Integer,Piece> toutesPieces; // this integer should target the reference
    private Map<Integer,Piece> toutePieceFragiles;

    public Nomenclature(String name) {
        this.name = name;
        this.toutesPieces = new HashMap<>();
        this.toutePieceFragiles = new HashMap<>();
    }

    public void ajouter(int numero_reference,Piece piece){
        toutesPieces.put(numero_reference, piece);
    }
    public void ajouter_piece_fragile(int numero_reference,Piece piece){
        toutePieceFragiles.put(numero_reference, piece);
    }

    @Override
    public String toString() {
        toutesPieces.putAll(toutePieceFragiles);
        String s="";
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int reference = entry.getKey();
            Piece piece = entry.getValue();
                s+=" La piece: " + piece.toString() + ", De reference: " + reference+"\n";
            }
        return s+"";
    }

        public Piece chercherUnePiece(int reference){
        String s="";
        Map<Integer,Piece> list = null;
        if(toutesPieces.containsKey(reference))
            list = toutesPieces;
        else if (toutePieceFragiles.containsKey(reference))
            list = toutePieceFragiles;
        else{
            System.out.println("Objet non trouvé !");
        }
            assert list != null;
            for(Map.Entry<Integer, Piece> entry : list.entrySet()) {
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
        Map<Integer,Piece> list = null;
        if(toutesPieces.containsValue(p))
            list = toutesPieces;
        else if (toutePieceFragiles.containsValue(p))
            list = toutePieceFragiles;
        else{
            System.out.println("Objet non trouvé !");
        }
        assert list != null;

        for(Map.Entry<Integer, Piece> entry : list.entrySet()) {
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

    public void supprimer_piece(Piece piece){
        Map<Integer,Piece> list = null;
        if(toutesPieces.containsValue(piece))
            list = toutesPieces;
        else if (toutePieceFragiles.containsValue(piece))
            list = toutePieceFragiles;

        boolean b;
        if(list != null){
            b = list.entrySet().removeIf(e -> (e.getValue().getClass() == PieceDeBase.class && e.getValue().equals(piece)));
             System.out.println("C'est fait?: "+b);
            } else{
            System.out.println("Objet non trouvé Pour la suppression");
        }
    }
/* Q 3.7 Ajouter une méthode Menu qui sera lancée par MainMenu.
*/
    public void afficher_meme_domination(){
        System.out.println("\t\t This Loop loops over 2 Maps!");
        toutesPieces.putAll(toutePieceFragiles);
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int i=0;
            Piece piece = entry.getValue();
            String temp = piece.getDenomination();
            for(Map.Entry<Integer,Piece> entry1:toutesPieces.entrySet()){
                if(entry1.getValue().getDenomination().equals(temp)){
                    i++;
                }
            }
            if(i>1){
                System.out.println(piece);
            }
        }
    }

// Q 4.2
// affichage de toutes les pieces fragiles => Un document  qui contient les infos  des Pieces fragiles

    public String toStringPieceFragiles() {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<Integer, Piece> entry : toutePieceFragiles.entrySet()) {
            int reference = entry.getKey();
            Piece piece = entry.getValue();
            s.append(" La piece: ").append(piece.toString()).append(", De reference: ").append(reference).append("\n");
        }
        return s + "";
    }

    public void trier(){
        Map<Integer, Piece> map =toutesPieces;
        System.out.println("Before sorting");
        map.forEach((k,v)->System.out.println(k+"="+v));

        System.out.println("After Sorting by value");
        List<Map.Entry<Integer, Piece>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<Integer>) ((Map.Entry<Integer, Integer>) (o1)).getKey()).compareTo(((Map.Entry<Integer, Integer>) (o2)).getKey());
            }
        });

        System.out.println(" sorting");

        Map<Integer, Piece> result = new HashMap<>();
        Iterator<Map.Entry<Integer, Piece>> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Piece> entry = it.next();
            result.put(entry.getKey(), entry.getValue());
        }
        toutesPieces = result;
    }



}
