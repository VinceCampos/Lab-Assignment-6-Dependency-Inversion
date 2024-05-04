public class TestProgram {
    public static void main(String[] args) {
        
        Student student1 = new Student("1234", "Orton", "Randy", "A Game Of Thrones");
        ProcessBook process1 = new ProcessBook(student1, new BorrowBook());
        process1.processBook();

        Student student2 = new Student("2258", "Austin", "Steve", "Soul Therapy");
        ProcessJournal process2 = new ProcessJournal(student2, new BorrowJournal());
        process2.processJournal();

        Student student3 = new Student("0071", "Barnes", "Scottie", "The Hobbit");
        ProcessBook process3 = new ProcessBook(student3, new BorrowBook());
        process3.processBook();
    }
}