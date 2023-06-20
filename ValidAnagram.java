/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.

        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true

        Example 2:
        Input: s = "rat", t = "car"
        Output: false */


public class ValidAnagram {
    public static void main(String[] args) {
       String s = "anagram";
       String t = "nagaram";
        System.out.println(validAnagram(s,t));
    }
    public static boolean validAnagram(String s, String t) { // создаем метод
        if (s.length() != t.length())  //Проводим первую проверку и выясняем равны ли длина строк
            return false;
        char[] letter = new char[26]; /* создаем массив, куда будем ложить элементы. Массив создаем на 26 букв
                                      (все бквы английского алфавита)*/
        for (int i = 0; i < s.length(); i++) { //запускаем цикл для заполнения массива
            letter[s.charAt(i) - 'a']++; // методом charAt заполняем массив элементами стороки s
            letter[t.charAt(i) - 'a']--; // методом charAt убираем из массива элементы строки t
        }
        for (int remain : letter) {  // еще раз запускаем цикл и смотрим что осталось в остатке
            if (remain != 0)         // если в осттке хоть что-то осталось значит неправда.
                return false;
        }
        return true;
    }

    }

