package duke;

import java.time.LocalDate;

/**
 * A Task that specifies a date of occurrence. Supports Task description and time
 */
public class Event extends Task {

    Event(String description, LocalDate time) {
        super(description, time);
    }

    Event(String description, boolean isDone, LocalDate time) {
        super(description, isDone, time);
    }

    @Override
    public String toString() {
        assert time.isPresent() : "time of event not available";

        String tempStr = " ";

        if (isDone) {
            tempStr = "X";
        }

        return "[E][" + tempStr + "] " 
                + description + "(" 
                + time.get().format(DATE_FORMATTER) + ")";
    }
}

