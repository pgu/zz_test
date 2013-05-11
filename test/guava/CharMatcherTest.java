package guava;

import junit.framework.Assert;

import org.junit.Test;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {

    @Test
    public void charMatcher_digit_ok() {
        final boolean matchesAllOf = CharMatcher.DIGIT.matchesAllOf("1234");
        Assert.assertTrue(matchesAllOf);
    }

    @Test
    public void charMatcher_digit_ko() {
        final boolean matchesAllOf = CharMatcher.DIGIT.matchesAllOf("12E4");
        Assert.assertFalse(matchesAllOf);
    }

    @Test
    public void hasWhitespace() {
        Assert.assertTrue(CharMatcher.WHITESPACE.matchesAllOf(" "));
    }

}
