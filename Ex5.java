import java.util.ArrayList;
import java.util.Scanner;

// Каталог товаров книжного магазина сохранен в виде двумерного списка 
// List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка содержится 
// название жанра, а на остальных позициях - названия книг. Напишите метод для 
// заполнения данной структуры.

public class Ex5 {
   public static void main(String[] args){
    ArrayList<ArrayList<String>> list = new ArrayList<>();
    list.add(new ArrayList<String>());
    list.add(new ArrayList<String>());
    list.add(new ArrayList<String>());
   Scanner sc = new Scanner(System.in);
   for (int i = 0; i < list.size(); i++){
        System.out.println("Введите жано");
        list.get(i).add(sc.nextLine());

        for (int j = 0; j < 3; j++) {
       System.out.println("Введите название произведения");
       list.get(i).add(sc.nextLine()); 
        }
    }
    sc.close();
    System.out.println(list);
   } 
}
