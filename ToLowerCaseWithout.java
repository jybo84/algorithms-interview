/*Given a string s, return the string after replacing every uppercase
letter with the same lowercase  letter.

        Example 1:
        Input: s = "Hello"
        Output: "hello"  */



public class ToLowerCaseWithout {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(little(s));
    }
public static String little(String s){    // создаем метод
        char[] letter = s.toCharArray();  // преобразовываем строку в массив символов
        for(int i = 0; i < letter.length; i ++){  // запускаем перебираем каждый элемент массива
            if (letter[i] >= 'A' && letter[i] <= 'Z'){ // задаем условие согласно АСКИ
                letter[i] = (char) (letter[i] + 32);  // приводим тип в нужный нам вид (char)
            }
        }
        return new String(letter);
}
}
