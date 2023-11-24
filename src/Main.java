//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        OffsetDateTime giorni = data.plusDays(7);
        System.out.println(giorni);
        OffsetDateTime mesi = data.minusMonths(1);
        System.out.println(mesi);
        OffsetDateTime anno = data.plusYears(1);
        System.out.println(anno);
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy",Locale.ITALY)));
    }
}