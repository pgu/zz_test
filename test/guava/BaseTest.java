package guava;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Preconditions;

public class BaseTest {

    @Test
    public void checkNotNull_ok() {
        final Object reference = new Object();

        final Object validatedRef = Preconditions.checkNotNull(reference);

        Assert.assertEquals(reference, validatedRef);
    }

    @Test(expected = NullPointerException.class)
    public void checkNotNull() {
        final String data = null;
        Preconditions.checkNotNull(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkArgument() {
        final int speed = -1;
        Preconditions.checkArgument(speed > 0, "must be positive");
    }

    @Test(expected = IllegalStateException.class)
    public void checkState() {
        final boolean isRunning = false;
        Preconditions.checkState(isRunning , "must be running");
    }

}

