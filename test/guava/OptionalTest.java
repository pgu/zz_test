package guava;

import junit.framework.Assert;

import org.junit.Test;

import com.google.common.base.Optional;

public class OptionalTest {

    @Test
    public void optional_is_present() {
        final String reference = "toto";
        final Optional<String> opt = Optional.of(reference);

        Assert.assertTrue(opt.isPresent());
        Assert.assertEquals(reference, opt.get());
    }

    @Test
    public void optional_absent() {
        final Optional<Object> opt = Optional.absent();
        Assert.assertFalse(opt.isPresent());
    }

    @Test
    public void optional_from_nullable() {
        final Object nullableReference = null;
        final Optional<Object> opt = Optional.fromNullable(nullableReference);
        Assert.assertFalse(opt.isPresent());
    }

}
