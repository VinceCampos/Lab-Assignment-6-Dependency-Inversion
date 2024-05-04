public class ProcessJournal {
    private Student student;
    private BorrowJournal journal;

    public ProcessJournal(Student student, BorrowJournal journal) {
        this.student = student;
        this.journal = journal;
    }

    public void processJournal() {
        journal.borrow(student.getTitle());
    }
}