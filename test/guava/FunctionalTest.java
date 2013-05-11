package guava;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class FunctionalTest {

    @Test
    public void functionTest() {
        final List<String> inputs = Arrays.asList("to", "ti", "ta");

        final Function<String, String> fn = new Function<String, String>() {

            @Override
            public String apply(final String input) {
                return input + input;
            }
        };

        final Iterable<String> outputs = Iterables.transform(inputs, fn);

        Assert.assertEquals(ImmutableList.of("toto", "titi", "tata"), ImmutableList.copyOf(outputs));
    }

    @Test
    public void predicateTest() {
        final List<Integer> inputs = ImmutableList.of(1, 2, 3, 4, 5, 6);

        final Predicate<Integer> pr = new Predicate<Integer>() {

            @Override
            public boolean apply(final Integer input) {
                return input % 2 == 0;
            }
        };

        final Iterable<Integer> outputs = Iterables.filter(inputs, pr);
        Assert.assertEquals(ImmutableList.of(2, 4, 6), ImmutableList.copyOf(outputs));

    }

}
