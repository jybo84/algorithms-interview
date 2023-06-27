/*You're given strings jewels representing the types of stones that are jewels, and stones representing the
stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones
you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

        Example 1:

        Input: jewels = "aA", stones = "aAAbbbb"
        Output: 3
        Example 2:

        Input: jewels = "z", stones = "ZZ"
        Output: 0 */



                                      // SOLUTION 1      with  Set
/*     import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;                                             // создаем счетчик
        Set<Character> element = new HashSet<>();                  // создаем коллекцию где будим хранить перебираемые элементы
        for (Character t: jewels.toCharArray()){                   // проходимся по украшениям
            element.add(t);                                        // добавляем в коллекцию
        }
        for(Character r: stones.toCharArray()){                    // проходимся по камням
            if(element.contains(r)){                               // содаем условие: если елементы сформированной коллекции равны имеющимся камням
                count++;                                           // тогда добавляем
            }
        }
        return count;                                               // возвращаем итоговое значение
    }
} */

                              //  SOLUTION 2   without  Set

 class JewelsAndStones {
     public static void main(String[] args) {
         String jewels = "aA";
         String stones = "aAAbbbb";
         System.out.println(solution(jewels, stones));
     }
public static int solution(String jewels, String stones){
         int count = 0;                                     // создаем счетчик
         for(char t: jewels.toCharArray()){                 // проходимся по первой строке и выдергиваем отдельно в массив каждый элемент
             for (char r: stones.toCharArray()){            // проходимся по второй строке и выдергиваем отдельно в массив каждый элемент
                 if(t == r){                                // сравниваем полученые значения, с условием если значения равны
                     count++;                               // прибавляем в счетчике значение
                 }
             }
         }
         return count;                                      // возвращвем итог
}
 }