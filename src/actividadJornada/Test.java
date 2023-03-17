
package actividadJornada;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
         Jornada[] t = new Jornada[3];
        t[0] = new Jornada("32", LocalDate.of(2021, 6, 13),
                LocalTime.of(8, 0), LocalTime.of(15, 30));
        t[1] = new Jornada("21", LocalDate.of(2021, 7, 18),
                LocalTime.of(8, 0), LocalTime.of(15, 30));
        t[2] = new Jornada("32", LocalDate.of(2021, 4, 9),
                LocalTime.of(8, 0), LocalTime.of(15, 30));
        
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    }
        
}

