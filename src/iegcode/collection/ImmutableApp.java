package iegcode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/// immutable list yang ga bisa di rubah kembali datanya
public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> emty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("El");
        mutable.add("Gibran");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements= List.of("Ibrahim", "El", "Gibran");
    }
}
