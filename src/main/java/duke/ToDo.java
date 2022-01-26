package duke;

class ToDo extends Task {

    ToDo(String description) {
        super(description);
    }

    ToDo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        String tempStr = " ";

        if (this.isDone) {
            tempStr = "X";
        }

        return "[T][" + tempStr + "] " + this.description;
    }

}