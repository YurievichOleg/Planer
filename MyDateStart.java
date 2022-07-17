/** Класс MyDateStart явояется наследником класса MyDate.
 * Отвечает за создание даты начала задания.
 * 
 */

package Planer;



public class MyDateStart extends MyDate{
    public MyDateStart(int year, int month, int day){
        super(year, month, day);
    }

    public MyDateStart(){
        super(Today.getYear(), Today.getMonth(), Today.getDay());
    }
    
   
    
    
}
