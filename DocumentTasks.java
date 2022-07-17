package Planer;

/** Интерфейс DocumentTasks является базовым для классов MdFormat и XmlFormat.
 * Указывает каким образом будут создаваться записи.
 */

public interface DocumentTasks {
    public void start(StringBuilder sb);

    public void add(StringBuilder sb, Task task);

    public void end(StringBuilder sb);
    
}
