package Planer;
/** Класс XmlFormat отвечает за запись в формате .xml */


public class XmlFormat implements DocumentTasks {

    @Override
    public void start(StringBuilder sb) {
        sb.append("\n<xml>\n");
        
    }

    @Override
    public void add(StringBuilder sb, Task task) {
        
        sb.append("    <item>" + task.toString() + " <item>\n");
        
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("\n</xml>\n");        
    }
    
}
