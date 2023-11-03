package calculo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        var semanaPassadaLocalDate = localDate.minusDays(7);
        var proximaSeamanaLocalDate = localDate.plusDays(7);

        System.out.println("Hoje é: " + localDate);
        System.out.println("Semana passada foi: " + semanaPassadaLocalDate);
        System.out.println("Próxima semana será: " + proximaSeamanaLocalDate);

        var semanaPassadaLocalDateTime = localDateTime.minusDays(7);
        var proximaSeamanaLocalDateTime = localDateTime.plusDays(7);
        var maisQuatroHoras = localDateTime.plusHours(4);
        var menosDoisMinutos = localDateTime.minusMinutes(2);


        System.out.println("\nHoje é: " + localDateTime);
        System.out.println("Semana passada foi: " + semanaPassadaLocalDateTime);
        System.out.println("Próxima semana será: " + proximaSeamanaLocalDateTime);
        System.out.println("Mais 4h: " + maisQuatroHoras);
        System.out.println("Menos dois minutos: " + menosDoisMinutos);

        var semanaPassadaInstant = instant.minus(7, ChronoUnit.DAYS);
        var proximaSemanaInstant = instant.plus(7, ChronoUnit.DAYS);
        var maisQuatroHorasInstant = instant.plus(4, ChronoUnit.HOURS);
        var menosDoisMinutosInstant = instant.minus(2, ChronoUnit.MINUTES);


        System.out.println("\nHoje é: " + instant);
        System.out.println("Semana passada foi: " + semanaPassadaInstant);
        System.out.println("Próxima semana será: " + proximaSemanaInstant);
        System.out.println("Mais 4h: " + maisQuatroHorasInstant);
        System.out.println("Menos dois minutos: " + menosDoisMinutosInstant);

        // Calculando duração
        Duration durationD = Duration.between(semanaPassadaLocalDate.atStartOfDay(), localDate.atStartOfDay());
        System.out.println("\nDuração em dias(localDate): " + durationD.toDays());

        Duration durationDT = Duration.between(semanaPassadaLocalDateTime, localDateTime);
        System.out.println("\nDuração em dias(localDateTime): " + durationDT.toDays());

        Duration durationI = Duration.between(semanaPassadaInstant, instant);
        System.out.println("\nDuração em dias(instant): " + durationI.toDays());

        Duration duration = Duration.between(proximaSemanaInstant, instant);
        System.out.println("\nDuração em dias(instant): " + duration.toDays());
    }
}
