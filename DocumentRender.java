package Planer;
/** Класс  DocumentRender работает с классами-наследниками класса DocumentTasks.
 * Записывает экземпляры класса Task в StringBuilder sb.
 */


import java.util.ArrayList;

public class DocumentRender <T extends DocumentTasks> {
    private StringBuilder sb;
    private T docFormat;

    public DocumentRender(T format){
        sb = new StringBuilder();
        docFormat = format;
    }

    public void addTasksToDoc(ArrayList<Task> tasks){
        docFormat.start(sb);

        tasks.sort(new TaskComporator());
        for (Task task : tasks){
            docFormat.add(sb, task);
        }

        docFormat.end(sb);
    }

    @Override
    public String toString() {
        
        return sb.toString();
    }
}
