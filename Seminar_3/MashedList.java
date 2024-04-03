package Seminar_3;
/*📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
*/



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MashedList {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>(
                Arrays.asList("привет", "!", "78", "мой", "телефон", "666", "6", "п", "звони"));
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (isNumber(element)) {
                iterator.remove();
            }
        }
        System.out.println(strs);
    }

    private static boolean isNumber(String element) {
        try {
            Integer.parseInt(element);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}