package Planer;
/** Класс StorageTasks отвечает за создание экземпляров коллекции Map, 
 * ключом в которой служит экземпляр класса User, 
 * а значения хранятся в списке из элементов класса Task.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageTasks {
    Map<User,ArrayList<Task>> storage = new HashMap<>();

    public void addToStorage(User user, Task task){
        if (!storage.containsKey(user)){
            storage.put(user, new ArrayList<>());            
        }
        storage.get(user).add(task);
    }
}
