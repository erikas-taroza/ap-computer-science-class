package Module15.Assignments.HomeworkV3;

public class Math extends Homework {

    public Math() {
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
}
