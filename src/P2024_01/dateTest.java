package P2024_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class dateTest {
    public static void main(String[] args) {
        String date = "2024-02";
        LocalDate month = LocalDate.parse(date);
        System.out.println(month.getMonthValue());

    }
}
