package CountingElements;

public class PermCheck {

  public static void main(String[] args) {

  }

  class Solution {
    public int solution(int[] A) {
      final int length = A.length;
      Boolean[] occurences = new Boolean[length + 1];
      occurences[0] = true;
      for (int element : A) {
          if (element > length) {
              return 0;
              }
          occurences[element] = true;
      }
      for (boolean b : occurences) {
          if (!b) return 0;
          }
      return 1;
    }
  }
}
