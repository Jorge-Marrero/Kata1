package kata1;
import java.time.LocalDate;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, 11, 16);     
        Person person = new Person("Jorge", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
