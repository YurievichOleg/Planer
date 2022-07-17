package Planer;
/** Класс TaskComporator создан для возможности сортировать списки с экземплярами класса Task,
 * по дате окончания задачи. Чем ближе дата - тем тем первее задача будет стоять в списке.
 */

import java.util.Comparator;

public class TaskComporator implements Comparator<Task>{

    @Override
    public int compare(Task o1, Task o2) {
        if (o1.end.getYear()*365 + o1.end.getMonth()*30 + o1.end.getDay() > 
        o2.end.getYear()*365 + o2.end.getMonth()*30 + o2.end.getDay()){
            return 1;
        }else if (o1.end.getYear()*365 + o1.end.getMonth()*30 + o1.end.getDay() < 
        o2.end.getYear()*365 + o2.end.getMonth()*30 + o2.end.getDay()){
            return -1;
        }else{
            return 0;
        }
        
    }
    
    
}
