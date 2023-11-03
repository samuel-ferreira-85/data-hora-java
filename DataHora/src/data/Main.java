package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-11-02");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-11-02T16:58:00");
        Instant instant = Instant.parse("2023-11-02T01:30:00Z");

        LocalDate r1 = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));

        System.out.println("R1 -> " + r1);
        System.out.println("R2 -> " + r2);
        System.out.println("R3 -> " + r3);
        System.out.println("R4 -> " + r4);
        System.out.println("-- Obtendo dados de uma data local --");
        System.out.println("Dia = " + localDate.getDayOfMonth());
        System.out.println("Mês = " + localDate.getMonth());
        System.out.println("Mês = " + localDate.getMonthValue());
        System.out.println("Ano = " + localDate.getYear());
        System.out.println("Horas = " + localDateTime.getHour());
        System.out.println("Minutoa = " + localDateTime.getMinute());
        System.out.println("Segundos = " + localDateTime.getSecond());

    }

}
