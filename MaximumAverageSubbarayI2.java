/*   You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.

Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000  */



public class MaximumAverageSubbarayI2 {
    public static void main(String[] args) {
        int[] num = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(solution(num, k));
    }

    public static double solution(int[] nums, int k){  // создаем метод
        int mid = 0;                                   // вводим третью переменную
        for(int i = 0; i < k; i++){                    // запускаем цикл с границей К, первые числа
          mid = mid+nums[i];                       // вычислем среднее значение чисел до К
        }
        int maxMid = mid;                              // вводим еще переменную - макс. средняя и присваиваем ей уже имеющеесязначение
        for(int i = k; i < nums.length; i++){          // Запусскаем цикл, со значения К, так как до него уже все расчитано
           mid = mid-nums[i - k];                  // делаем окно. Первый элемент бираем
           mid = mid+nums[i];                      // новыый элемент добавляем
            if(maxMid < mid){                          // ставим условие по обнаружению макс. средней
                maxMid = mid;
            }
        }
        return maxMid/(k*1.0d);                   // преобразуем значение
    }

}

