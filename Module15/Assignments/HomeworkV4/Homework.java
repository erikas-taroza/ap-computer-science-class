package Module15.Assignments.HomeworkV4;

public abstract class Homework implements Processing, Comparable<Homework> {
    private int pages;
    private String type;

    public Homework() {
        pages = 0;
        type = "none";
    }

    public abstract void CreateHomework(int pages, String type);

    public int GetPages() {
        return pages;
    }

    public void SetPages(int count) {
        pages = count;
    }

    public String GetType() {
        return type;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public String ToString() {
        return type + " - " + pages + " pages";
    }
}
