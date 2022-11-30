import java.util.ArrayList;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class Ex4 {
    public static void main(String[] args) {
        final ArrayList list = new ArrayList();
        list.add("Юпитер");
        list.add(23488585);
        list.add("Плутон");
        list.add(55555);
        list.add(0305474);
        list.add("ваооп");
        list.add("Мооаоа");
        list.add("овопооп");
        list.add("Юпитер");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
