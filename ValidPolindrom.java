/* Description
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and
numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Этапы решения:
1. Необходимо удалить все пробелы и не буквенно - цифровые символы.
2. Преобразовать строку в строчные буквы
3. установить указатели с каждой из сторон
4. переходим от буквы к буквы
5. Производить сравнение до момента пока указатели не сравняются

*/
public class ValidPolindrom {
    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrom(s));
    }
    public static boolean palindrom(String s) {    // создаем метод
        s = s.toLowerCase().replaceAll("[^A-Zz-z0-9]", ""); //прелбразуем строку в нижний регистр, удаляем все небуквенные символы
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) { // проверяем совпадают ли символы
                return false;
            }
            i++;
            j--;
        }
            return true;
        }
    }



