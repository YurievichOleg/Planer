/** Класс User отвечает за создание экземпляров, которые являются 
 * людьми, которым будут присваиваться задачи
*/

package Planer;

public class User {
    private static Integer id;
    private String name;
    private String lastName;
    private int ids;
    static {
        id = 1;
    }

    private User(String name, String lastName, int ids) {
        this.name = name;
        this.lastName = lastName;
        this.ids = ids;
        id++;

    }

    public User(String name, String lastName){
        this(name, lastName, id);
    }

    public Integer getId() {
        return this.ids;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

}
