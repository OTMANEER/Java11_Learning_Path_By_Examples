package MiniProjet;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Nomenclature {
    private String name;
    Map<Integer,Piece> toutesPieces; // this integer should target the reference
    private Map<Integer,Piece> toutePieceFragiles;

    public Nomenclature(String name) {
/*        Comparator<Paire<Piece,Integer>> c= new Comparator<Paire<Piece, Integer>>() {
            @Override
            public int compare(Paire<Piece, Integer> pieceIntegerPaire, Paire<Piece, Integer> t1) {
                return pieceIntegerPaire.getPiece().getReference() - t1.getPiece().getReference();
            }
        };*/
        this.name = name;
        this.toutesPieces = new TreeMap<>();
        this.toutePieceFragiles = new TreeMap<>();
    }

    public void ajouter(int numero_reference,Piece piece){
        Piece p = toutesPieces.put(numero_reference, piece);
    }
    public void ajouter_piece_fragile(int numero_reference,Piece piece){
        Piece p = toutePieceFragiles.put(numero_reference, piece);
    }

    @Override
    public String toString() {
        toutesPieces.putAll(toutePieceFragiles);
        StringBuilder s= new StringBuilder();
        for(Map.Entry<Integer, Piece> entry : toutesPieces.entrySet()) {
            int reference = entry.getKey();
            Piece piece = entry.getValue();
                s.append(piece.toString()).append("\n");
            }
        return s.toString();
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
            System.out.println("****************************************");
            System.out.println("Objet non trouvé !");
            System.out.println("****************************************");
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
            System.out.println("****************************************");
            System.out.println("Aucune Piece Composite trouvée, Je pense qu'il s'agit d'une piece de Base!");
            System.out.println("****************************************");
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
            System.out.println("****************************************");
            System.out.println("Objet non trouvé Pour la suppression");
            System.out.println("****************************************");
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
        return s+"";
    }

    public void trier(){
        System.out.println("Les pieces fragiles ne sont pas concernées. ");
        System.out.println("Trie en cours ordre croissant...");
        Map<Integer, Piece> treeMap = new TreeMap<>(toutesPieces);
        toutesPieces = new TreeMap<>(treeMap);
    }

    public String getName() {
        return name;
    }

    public void sauvegarder_nomenclature(String nom) throws IOException {
        System.out.println("La nomenclature: "+this.getName());
        FileWriter myWriter = new FileWriter(nom);
        myWriter.write(this.toString());
        myWriter.close();
        System.out.println("Successfully Saved! Verify; "+nom);
    }

    public static Nomenclature lire_nomenclature(String  nom) throws IOException {
        Nomenclature nomenclature=null;
        PieceComposite pieceComposite = null;
        PieceDeBase pieceDeBase;
        long start = System.currentTimeMillis();
        Path path = Paths.get("src/MiniProjet/files/"+nom);
        BufferedReader reader = Files.newBufferedReader(path);
        String line;
        String nomNomenclature ="";
        String nomComposite="";
        int refComposite;
        float poidComposite = 0;
        int refBase;
        int occurenceBase;
        int Lines=0;
        boolean flagLine=false;
        while((line = reader.readLine())!=null){
            line = line.stripLeading();
            line = line.stripTrailing();
            String[] t = line.split(" ");
            Lines++;
            if(Lines==1){
                nomNomenclature =t[0];
                 nomenclature = new Nomenclature(nomNomenclature);
            }else if(t.length == 3){
                refComposite =Integer.parseInt(t[0]);
                nomComposite = t[1];
                poidComposite =Float.parseFloat(t[2]);
                pieceComposite = new PieceComposite(nomComposite,poidComposite,refComposite);
                nomenclature.ajouter(refComposite,pieceComposite);
            }else if(t.length == 2){
                refBase =Integer.parseInt(t[0]);
                occurenceBase =Integer.parseInt(t[1]);
                if(refBase == -1){
                    flagLine= true;
                    continue;
                }
                pieceDeBase = new PieceDeBase(refBase,occurenceBase);
                assert pieceComposite != null;
                pieceComposite.ajouter_piece(pieceDeBase,refBase);
            }
        }
        return nomenclature;
    }
}
