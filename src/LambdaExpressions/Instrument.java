package LambdaExpressions;
@FunctionalInterface
public interface Instrument {
    void play();
    default void haha(){};
    static void integ(){};
}
