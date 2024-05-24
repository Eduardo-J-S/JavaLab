package map.Ordenacao;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class PriceComparator implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Entry<String, Book> o1, Entry<String, Book> o2) {
        return Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice());
    }
}
