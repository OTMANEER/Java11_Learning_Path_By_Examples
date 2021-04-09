package LambdaExpressions.part4;

public enum coffee {
    OTMANE,SALEH,BILAL,SOUFIANE;
    private int qty;

    private coffee() {
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
