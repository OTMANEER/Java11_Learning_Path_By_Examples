package MiniProjet;

import java.util.LinkedList;

public abstract class Piece{
    public int reference;
    public String denomination;
    public float poids;
    public abstract float getPoid() throws Exception;

    public String getDenomination() {
        return denomination;
    }

    public int getReference() {
        return reference;
    }
}
