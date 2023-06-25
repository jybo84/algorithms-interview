
/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

        Example 1:
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
        Explanation: [4,9] is also accepted. */



import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class IntersectionOfTwoArrays {   // класс - название задачи
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
        System.out.println(Arrays.toString(solution(nums1, nums2))); // используем метод Arrays.toString выводим результат - массив
    }

    public static int[] solution(int[] nums1, int[] nums2) { // создаем метод который принимает 2 массива
        Set<Integer> first = new HashSet<>(); // создаем пустую таблицу куда в дальнейшем перенесем первый массив
        for (int i : nums1) { // перебираем элементы первого массива
            first.add(i);   // кладем все в таблицу
        }
        Set<Integer> second = new HashSet<>(); // создаем вторую таблицу куда в дальнейшем перенесем элементы второго массива
        for (int j : nums2) { // перебиваем второй массив
            if (first.contains(j)) { // условие: вторую таблицу заплняем в том случае если его элементы совпадают с элементами первого массива
                second.add(j); // заполняем вторую таблицу с условием
            }
        }
        int[] total = new int[second.size()]; // создаем итоговый массив и определяем его длину длиной второй таблицы
        int index = 0;
        for (int t : second) {   // перебираем элементы и заполняем массив
            total[index++] = t;
        }
        return total;
    }

}


