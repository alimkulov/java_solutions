package kz.mylab.lesson29;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate ld1=LocalDate.of(2022,6,10);
        System.out.println(ld1);
        LocalDate ld2=LocalDate.of(2022,Month.JUNE,3);
        System.out.println(ld2);

        LocalTime lt1=LocalTime.of(15,32,45,999);
        System.out.println(lt1);

        LocalDateTime ldt1=LocalDateTime.of(2015,Month.APRIL,29,15,30);
        System.out.println(ldt1);
        LocalDateTime ldt2=LocalDateTime.of(2015,Month.APRIL,29,15,30,45,45645646);
        System.out.println(ldt2);
        LocalDateTime ldt3=LocalDateTime.of(ld1,lt1);
        System.out.println(ldt3);
    }
}
