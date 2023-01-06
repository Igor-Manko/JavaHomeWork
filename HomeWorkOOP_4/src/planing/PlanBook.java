package planing;

import java.time.LocalDateTime;

public class PlanBook {
    int id;
    LocalDateTime dateTime;
    String deadLineDate;
    String author;
    String priority;

    public PlanBook(int id, LocalDateTime dateTime, String deadLineDate, String author, String priority) {
        this.id = id;
        this.dateTime = dateTime;
        this.deadLineDate = deadLineDate;
        this.author = author;
        this.priority = priority;
    }

    public String printPlanTask() {
        return "PlanBook{" +
                " id= " + id +
                ", dateTime= " + dateTime +
                ", deadLine= " + deadLineDate +
                ", author= '" + author + '\'' +
                ", priority= '" + priority + '\'' +
                '}';
    }

    public int sortPriority() {
        if (priority.equals("High")) {
            return 1;
        }
        if (priority.equals("Medium")) {
            return 2;
        }
        if (priority.equals("Low")) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }
}
