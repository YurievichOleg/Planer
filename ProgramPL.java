package Planer;



public class ProgramPL {
    public static void main(String[] args) {
        User hooman = new User("Олег","Павлов");
        MyDateStart start = new MyDateStart();
        MyDateEnd end = new MyDateEnd(5);

        Task task1 = new Task("Купить книгу по ООП",start, end);

        Task task2 = new Task(new MyDateStart(), new MyDateEnd(3));

        System.out.println(task1);
        System.out.println(task2.toString());
        StorageTasks storage = new StorageTasks();
        storage.addToStorage(hooman, task1);
        storage.addToStorage(hooman, task2);
        // storage.storage.get(hooman).get(1).start.setDate();
        System.out.println(storage.storage.get(hooman).toString()); 
        DocumentRender<XmlFormat> word = new DocumentRender<XmlFormat>(new XmlFormat());
        // storage.storage.get(hooman).sort(new TaskComporator());
        word.addTasksToDoc(storage.storage.get(hooman));
        System.out.println(word.toString());
    }
    
}
