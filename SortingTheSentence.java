/* A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words
in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

Example 2:
Input: s = "Myself2 Me1 I4 and3"
Output: "Me, Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
*/


import java.util.Map;
import  java.util.HashMap;

public class SortingTheSentence {

    public static void main(String[] args) {

        String s = "Myself2 Me1 I4 and3";
        System.out.println(solutions(s));
    }

    public static String solutions(String s){                // создаем метод
        Map<Integer, String> indexWord = new HashMap<>();    // создаем коллекцию где будим в дальнейшем хранить результаты умственной деятельности в правильном порядке

        for(String word: s.split(" ")){                 // разбиваем строку по пробелам  на каждый отдельный элемент и сохраняем как элементы массива

            int lastIndex = word.length() - 1;                // вводим новую переменную и определяем ее как каждний последний символ элемента массива (цифру)
            int index = word.charAt(lastIndex) - '0';  // ???  // методом CHAR выдергиваем этот последний элемент
            String actualWord = word.substring(0, lastIndex);   // задаем длину каждого элемента массива с буквенными символами - получчаем слова
            indexWord.put(index, actualWord);                   // укладываем индексы и слова в Хэш -  таблицу
        }
          StringBuilder right = new StringBuilder();            // создаем строковый конструктор
        for(Map.Entry<Integer, String> end : indexWord.entrySet()){
            right.append(end.getValue());
            right.append(" ");
        }
        return right.toString().trim();  // преобразуем в опрятный вид и убираем лишние пробелы
    }
}
