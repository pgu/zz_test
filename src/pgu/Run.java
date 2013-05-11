package pgu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Run {

    private static class Result {
        Integer min;
        Integer min_idx;

        Integer med;
        Integer med_idx;

        Integer max;
        Integer max_idx;
        @Override
        public String toString() {
            return "Result [min=" + min + ", min_idx=" + min_idx + ", med=" + med + ", med_idx=" + med_idx + ", max="
                    + max + ", max_idx=" + max_idx + "]";
        }

    }

    public static void main(final String[] args) {

        final Result r = handle(Arrays.asList(6, 3, 10));
        final Result r0 = handle(Arrays.asList(10, 6, 3));
        final Result r00 = handle(Arrays.asList(3, 6, 10));
        final Result r1 = handle(Arrays.asList(5, 5, 10));
        final Result r2 = handle(Arrays.asList(10, 10, 5));

        System.out.println(r);
        System.out.println(r0);
        System.out.println(r00);
        System.out.println(r1);
        System.out.println(r2);
    }

    private static Result handle(final List<Integer> ratings) {

        final int min  = Collections.min(ratings);
        final int max  = Collections.max(ratings);

        final int min_idx = ratings.indexOf(min);
        final int max_idx = ratings.indexOf(max);

        final List<String> indices = new ArrayList<String>(Arrays.asList("0", "1", "2"));
        indices.remove(min_idx + "");
        indices.remove(max_idx + "");

        final int med_idx = Integer.parseInt(indices.get(0));

        final Result r = new Result();
        r.min = min;
        r.min_idx = min_idx;

        r.med = ratings.get(med_idx);
        r.med_idx = med_idx;

        r.max = max;
        r.max_idx = max_idx;

        return r;
    }

    private void test1() {
        System.out.println("Hello world!");

        final Run run = new Run();

        try {
            run.doSomething();

        } catch (final RuntimeException e) {
            System.out.println(" log exception");

            if (e.getCause() != null) {
                if (ClassNotFoundException.class.equals(e.getCause().getClass())) {
                    System.out.println(" Not Found!! " + e.getCause().getMessage());
                }
            }

            e.printStackTrace();
        }

        // continue le traitement
        System.out.println("the end");
    }


    public void doClassCastException() {
        throw new ClassCastException("Bad cast!");
    }


    public void doSomething() {
        try {
            doClassNotFoundException();

        } catch (final ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void doClassNotFoundException() throws ClassNotFoundException {
        throw new ClassNotFoundException("Bad class!");
    }


}
