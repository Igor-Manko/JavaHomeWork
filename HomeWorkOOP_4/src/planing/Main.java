package planing;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Task g = new Task(7, LocalDateTime.now(), "10.02.23", "Nata", "UUU");
        Task b = new Task(1, LocalDateTime.now(), "12.02.23", "Ivan", "High");
        Task a = new Task(2, LocalDateTime.now(), "12.02.23", "Ivan", "Medium");
        Task c = new Task(3, LocalDateTime.now(), "21.01.23", "Egor", "Low");
        Task d = new Task(4, LocalDateTime.now(), "03.04.23", "Mary", "High");
        Task e = new Task(5, LocalDateTime.now(), "12.12.23", "Igor", "Medium");
        Task f = new Task(6, LocalDateTime.now(), "10.02.23", "Nata", "Low");

        List<Task> list = new ArrayList<>();
        list.add(g);
        list.add(b);
        list.add(a);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);

        FileWriter cswWriter = new FileWriter("C:\\Users\\admin\\Desktop\\GeekBrains\\Обучение\\" +
                "1 четверть\\NewJava\\Homework\\HomeWorkOOP_4\\src\\planing\\output.csv");

        for (Task task : list) {
            cswWriter.append(task.printPlanTask()).append(System.lineSeparator());
        }
        cswWriter.close();

        list.sort(Comparator.comparing(PlanBook::sortPriority));

        FileWriter csvWriterSort = new FileWriter("C:\\Users\\admin\\Desktop\\GeekBrains\\Обучение\\" +
                "1 четверть\\NewJava\\Homework\\HomeWorkOOP_4\\src\\planing\\outputSort.csv");

        for (int i = 0; i < list.size(); i++) {
            csvWriterSort.append(list.get(i).printPlanTask() + System.lineSeparator());
        }
        csvWriterSort.close();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).printPlanTask());
        }
    }
}
