package Module15.Assignments.HomeworkV4;

public class Science extends Homework {

    public Science() {
        super();
    }

    public void CreateHomework(int pages, String type) {
        super.SetPages(pages);
        super.SetType(type);
    }

    public void DoHomework(int pagesDone) {
        if (pagesDone > super.GetPages()) {
            System.out.println("ERROR: Cannot do more homework than assigned.");
            return;
        }

        super.SetPages(super.GetPages() - pagesDone);
    }

    public int compareTo(Homework other) {
        if (this.GetPages() > other.GetPages()) {
            return 1;
        } else if (this.GetPages() == other.GetPages()) {
            return 0;
        } else if (this.GetPages() < other.GetPages()) {
            return -1;
        }

        return 0;
    }
}
