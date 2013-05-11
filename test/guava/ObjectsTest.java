package guava;

import org.junit.Assert;
import org.junit.Test;

import pgu.Person;

import com.google.common.base.Objects;

public class ObjectsTest {

    @Test
    public void toStringHelper() {
        final Person p = new Person(1L, "Toto");

        final String description = Objects.toStringHelper(p) //
                .add("id", p.getId()) //
                .add("name", p.getName()) //
                .toString()
                ;

        Assert.assertEquals("Person{id=1, name=Toto}", description);
    }

}
