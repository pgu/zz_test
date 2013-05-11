package guava;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class StringTest {

    @Test
    public void splitter() {
        final Iterable<String> split = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split(" foo, ,bar,  quux,  ");

        final String[] expected = new String[] {"foo", "bar", "quux"};
        Assert.assertEquals("[foo, bar, quux]", Arrays.toString(expected));
        Assert.assertEquals(Arrays.toString(expected), split.toString());

    }

    @Test
    public void joiner() {
        final String actual = Joiner.on(", ").skipNulls().join("Kurt", "Kevin", null, "Chris");
        Assert.assertEquals("Kurt, Kevin, Chris", actual);
    }



}
