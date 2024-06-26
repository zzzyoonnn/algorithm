package Week11.나누어떨어지는배열;
import java.util.*;

public class jiyoon {
  class Solution {
    public int[] solution(int[] arr, int divisor) {
      int count = 0;

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] % divisor == 0) count++;
      }

      if (count == 0) {
        return new int[] {-1};
      }

      int index = 0;
      int[] answer = new int[count];
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] % divisor == 0) {
          answer[index++] = arr[i];
        }
      }

      Arrays.sort(answer);
      return answer;
    }
  }
}
