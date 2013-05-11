package pgu;

public class TestRun {

    private enum Errors {
        low, medium, high;
        
        private int count = 0;
        
        public void inc() {
            count++;
        }
        
        public void reset() {
            count = 0;
        }
    }
    
    private static void resetErrors() {
        Errors.low.reset();
        Errors.medium.reset();
        Errors.high.reset();
    }
    
    public static void main(String[] args) {

        
        for (int i = 0; i < 5; i++) {
            Errors.low.inc();
        }
        
        Errors.high.inc();
        Errors.high.inc();

        System.out.println(Errors.low.count);
        System.out.println(Errors.medium.count);
        System.out.println(Errors.high.count);
        
        resetErrors();
        
        System.out.println(Errors.low.count);
        System.out.println(Errors.medium.count);
        System.out.println(Errors.high.count);
        
    }

}
