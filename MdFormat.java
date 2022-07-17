package Planer;
/** Класс MdFormat отвечает за запись в формате .md */


public class MdFormat implements DocumentTasks{

    @Override
    public void start(StringBuilder sb) {
    }

    @Override
    public void add(StringBuilder sb, Task task) {
        sb.append("*" + task.toString() + "\n");        
    }

    @Override
    public void end(StringBuilder sb) {
    }
    
}
