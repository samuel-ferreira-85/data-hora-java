package convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Instanciação do agora
        LocalDate agoraLocalDate = LocalDate.now();
        LocalDateTime agoraLocalDateTime = LocalDateTime.now();
        Instant agoraInstant = Instant.now();

        // Conversão de string para classes time
        LocalDate strToLocalDate = LocalDate.parse("2023-11-02");
        LocalDateTime strToLocalDateTime = LocalDateTime.parse("2023-11-02T16:58:00");
        Instant instant = Instant.parse("2023-11-02T16:58:00Z");
        Instant strToInstantLocal = Instant.parse("2023-11-02T16:58:00-03:00");

        LocalDate formato1 = LocalDate.parse("27/08/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime formato2 = LocalDateTime.parse("27/08/1985 08:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate data = LocalDate.of(2023, 11, 2);
        LocalDateTime dataHora = LocalDateTime.of(1985, 8, 27, 8, 30);

        // Criando formatos
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("--- Instanciação ---");
        System.out.println("Agora LocalDate: " + agoraLocalDate);
        System.out.println("Agora LocalDateTime: " + agoraLocalDateTime);
        System.out.println("Agora Instant: " + agoraInstant);
        System.out.println("--- Conversão ---");
        System.out.println("Para LocalDate: " + strToLocalDate);
        System.out.println("Para LocalDateTime: " + strToLocalDateTime);
        System.out.println("Para Instant: " + instant);
        System.out.println("Para Instant Local: " + strToInstantLocal);
        System.out.println("Para LocalDate 00/00/0000: " + formato1);
        System.out.println("Para LocalDate 00/00/0000 00:00:00 : " + formato2);
        System.out.println("Criando data : " + data);
        System.out.println("Criando dataHora : " + dataHora);
        System.out.println("Formato 1: " + data.format(fmt1));
        System.out.println("Formato 2: " + fmt1.format(data));
        System.out.println("Formato 3: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Formato 4: " + dataHora.format(fmt2));
        System.out.println("Formato 4: " + dataHora.format(fmt1));
        System.out.println("Formato 5: " + fmt3.format(agoraInstant));


    }
}
