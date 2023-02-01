package duke;
class Event extends Task {
    public Event(String keyword, String message, Boolean status) {
        super(keyword, message, status);
    }
    @Override
    public String provideDetails() {
        String[] helperArray = this.description.split("/from");
        String firstPart = helperArray[0];
        String[] helperArray2 = helperArray[1].split("/to");
        String secondPart = helperArray2[0];
        String thirdPart = helperArray2[1];
        return this.completed ? "[E]" + "[x] " + firstPart + "(from:" + secondPart + "to:" + thirdPart + ")"
                              : "[E]" + "[ ] " + firstPart + "(from:" + secondPart + "to:" + thirdPart + ")";
    }
}
