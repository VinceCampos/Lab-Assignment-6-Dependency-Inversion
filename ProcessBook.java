public class ProcessBook {
    private Student student;
    private BorrowBook book;

    public ProcessBook(Student student, BorrowBook book) {
        this.student = student;
        this.book = book;
    }

    public void processBook() {
        book.borrow(student.getTitle());
    }
}