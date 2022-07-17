package Planer;

/** Класс Task отвечает за создание экземпляров, которые являются задачами.
 * Является наследником класса DoScanner, благодаря чему задачи можно вносить из терминала.
 * Так же имеет метод tostring
*/

public class Task extends DoScanner {
    String task;
    MyDateStart start;
    MyDateEnd end;

    public Task(String task, MyDateStart start, MyDateEnd end) {
        this.task = task;
        this.start = start;
        this.end = end;
    }

    private static String setTask() {
        System.out.println("Введите задачу, для этого");
        return writeText();
    }

    public Task(MyDateStart start, MyDateEnd end) {
        this(setTask(), start, end);

    }

    public Task() {
        this(new MyDateStart(), new MyDateEnd());
        this.start.setDate();
        this.end.setDate();
    }

    @Override
    public String toString() {
        return String.format("%s Начало: %s, Завершение: %s", this.task, start.toString(), end.toString());
    }

}
