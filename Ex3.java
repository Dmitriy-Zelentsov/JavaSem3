import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// Пройти по списку и удалить повторяющиеся элементы.

public class Ex3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Земля");
        list.add("Плутон");
        list.add("Меркурий");
        list.add("Марс");
        list.add("Марс");
        list.add("Марс");
        list.add("Марс");
        list.add("Юпитер");
        int count = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            count += 1;
            if ((i + 1) == list.size() || !list.get(i).equals (list.get(i+1))) {
                System.out.println(list.get(i) + " " + count);
                count = 0;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}