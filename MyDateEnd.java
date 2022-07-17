/** Класс MyDateEnd является наследником класса MyDate.
 * Отвечает за создание даты окончания задания.
 * Кроме прочего имеет конструктор с аргументом целочисленного типа, 
 * который задает дату, которая последует через то количество дней, которое указано в аргументе,
 * после нынешней датыю
*/

package Planer;



public class MyDateEnd extends MyDate{
    public MyDateEnd(int year, int month, int day){
        super(year, month, day);
    }

    public MyDateEnd(){
        super(Today.getYearEnd(1), Today.getMonthEnd(1), Today.getDayEnd(1));
    }
    
    public MyDateEnd(int a){
        super(Today.getYearEnd(a), Today.getMonthEnd(a), Today.getDayEnd(a));
    }
}
