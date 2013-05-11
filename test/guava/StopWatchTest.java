package guava;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Stopwatch;

public class StopWatchTest {

    @Test
    public void stopWatch() {
        final Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        try {
            Thread.sleep(500);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

        final long nanos = stopwatch.elapsed(TimeUnit.NANOSECONDS); // 504274000
        Assert.assertTrue(nanos > 500 * 1000000);

    }

}
