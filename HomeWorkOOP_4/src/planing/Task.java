package planing;

import java.time.LocalDateTime;

public class Task extends PlanBook {

    public Task(int id, LocalDateTime dateTime, String deadLineDate, String author, String priority) {
        super(id, dateTime, deadLineDate, author, priority);
    }
}
