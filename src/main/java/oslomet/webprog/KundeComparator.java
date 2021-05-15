package oslomet.webprog;

import java.util.Comparator;

public class KundeComparator implements Comparator {

    // oppgave 3 (forsøk også implementere denne med bruk av typeparameter for Comparator...)

        public int compare(Object o1, Object o2) {
            Kunde k1 = (Kunde) o1;
            Kunde k2 = (Kunde) o2;

            return k1.getNavn().compareTo(k2.getNavn());
        }

}