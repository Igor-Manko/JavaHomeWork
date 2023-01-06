package planing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task g = new Task(7, LocalDateTime.now(), "10.02.23", "Nata", "UUU");
        Task b = new Task(1, LocalDateTime.now(), "12.02.23", "Ivan", "High");
        Task a = new Task(2, LocalDateTime.now(), "12.02.23", "Ivan", "Medium");
        Task c = new Task(3, LocalDateTime.now(), "21.01.23", "Egor", "Low");
        Task d = new Task(4, LocalDateTime.now(), "03.04.23", "Mary", "High");
        Task e = new Task(5, LocalDateTime.now(), "12.12.23", "Igor", "Medium");
        Task f = new Task(6, LocalDateTime.now(), "10.02.23", "Nata", "Low");

        List<Task> list = new ArrayList<>();
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(a);
        list.add(g);

        list.sort(Comparator.comparing(PlanBook::sortPriority));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).printPlanTask());
        }
    }
}
