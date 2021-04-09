class Mutable {
    private String s;
    public void setS(String newS){ s = newS; }
    public String getS() { return s; }

    public static void main(String[] args) {
        Immutable m = new Immutable();
    }
}
final class Immutable {
    final private String s = "out";
    public String getS() { return s; }
}