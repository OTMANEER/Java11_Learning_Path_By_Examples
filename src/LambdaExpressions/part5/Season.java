package LambdaExpressions.part5;

public enum Season {
    SPRING{
        @Override
        public void rains(){
            System.out.println("Do not call me!");
        }
    },SUMMER{
        @Override
        public void rains(){
            System.out.println("Do not call me!");
        }
    },AUTUMN{
        @Override
        public void rains(){
            System.out.println("Do not call me!");
        }
    },WINTER{
        @Override
        public void rains(){
            System.out.println("Do not call me!");
        }
    };

    public abstract void rains();
}
