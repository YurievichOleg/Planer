/** Класс MyDate это абстрактный класс, отвечающий за создание дат.
 * Имеет методы возвращающие целочисленные значения года, месяца и дня.
 * Имеет переопределенный метод toString().
 * Имеет метод позволяющий устанавливать дату из консоли, 
 * т.к. является наследником класса DoScanner
 */

package Planer;

public abstract class MyDate extends DoScanner {
    private int year;
    private int month;
    private int day;
    protected MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    protected int getMonth() {
        return this.month;
    }
    protected int getYear() {
        return this.year;
    }
    protected  int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d", getYear(), getMonth(), getDay());
    }

    public void setDate(){
        System.out.println("\nВведите год, затем месяц, затем день:");
        this.year = Integer.parseInt(writeText());
        this.month = Integer.parseInt(writeText());
        this.day= Integer.parseInt(writeText());
    }
}
