package pgu;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.Gson;

public class TestGson {

    public static void main(final String[] args) {

        final HashMap<String, String> a = new Gson().fromJson("{\"edu1\":\"rostock\",\"edu2\":\"madrid\"}", HashMap.class);

        for (final Entry<String, String> e : a.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }

        System.out.println("done " + new Date().getTime());
    }

}
